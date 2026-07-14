import java.util.*;

class Solution {
    // 상, 하, 좌, 우 이동을 위한 배열
    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};

    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        // 방문 여부 및 거리를 기록할 배열 (0으로 초기화)
        int[][] visited = new int[n][m];
        
        // BFS를 위한 큐 생성 (x, y 좌표 저장)
        Queue<int[]> queue = new LinkedList<>();
        
        // 시작점 (0, 0) 설정
        queue.add(new int[]{0, 0});
        visited[0][0] = 1; // 시작 칸도 개수에 포함
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];
            
            // 상대 팀 진영(우측 하단)에 도착했을 때 거리 반환
            if (cx == n - 1 && cy == m - 1) {
                return visited[cx][cy];
            }
            
            // 4방향 탐색
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                // 맵 범위를 벗어나지 않고, 벽(0)이 아니며, 아직 방문하지 않은 경우
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (maps[nx][ny] == 1 && visited[nx][ny] == 0) {
                        // 큐에 넣을 때 바로 방문 처리를 해야 중복 방문(시간 초과)을 막습니다.
                        visited[nx][ny] = visited[cx][cy] + 1;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
        
        // 상대 팀 진영에 도달할 수 없는 경우
        return -1;
    }
}
