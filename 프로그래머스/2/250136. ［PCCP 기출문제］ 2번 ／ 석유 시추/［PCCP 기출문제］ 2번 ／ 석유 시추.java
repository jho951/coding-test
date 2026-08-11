import java.util.*;

class Solution {
    // 상하좌우 탐색을 위한 방향 배열
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n, m;
    static boolean[][] visited;
    static int[] oilPerCol; // 각 열마다 얻을 수 있는 총 석유량을 저장하는 배열

    public int solution(int[][] land) {
        n = land.length;
        m = land[0].length;
        visited = new boolean[n][m];
        oilPerCol = new int[m];

        // 전체 맵을 순회하며 석유 덩어리 탐색
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (land[i][j] == 1 && !visited[i][j]) {
                    bfs(land, i, j);
                }
            }
        }

        // 각 열의 최댓값 찾기
        int answer = 0;
        for (int total : oilPerCol) {
            answer = Math.max(answer, total);
        }

        return answer;
    }

    private void bfs(int[][] land, int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        visited[startX][startY] = true;

        // 현재 석유 덩어리가 포함되는 열을 중복 없이 저장할 Set
        Set<Integer> cols = new HashSet<>();
        int size = 0; // 석유 덩어리 크기

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            size++;
            cols.add(y); // 석유가 존재하는 열 등록

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 경계선 확인 및 방문 여부, 석유 존재 여부 확인
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (land[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }

        // 해당 덩어리가 지나가는 모든 열에 덩어리 크기를 더해줌
        for (int col : cols) {
            oilPerCol[col] += size;
        }
    }
}
