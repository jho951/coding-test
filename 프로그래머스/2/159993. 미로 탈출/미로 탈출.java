import java.util.*;

class Solution {
    // 상, 하, 좌, 우 이동을 위한 배열
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    static char[][] map;
    static int n, m;

    public int solution(String[] maps) {
        n = maps.length;
        m = maps[0].length();
        
        map = new char[n][m];
        int[] start = new int[0];
        int[] lever = new int[0];
        int[] end = new int[0];
        
        // 맵 정보 입력 및 S, L, E 위치 저장
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = maps[i].charAt(j);
                if (map[i][j] == 'S') {
                    start = new int[]{i, j};
                } else if (map[i][j] == 'L') {
                    lever = new int[]{i, j};
                } else if (map[i][j] == 'E') {
                    end = new int[]{i, j};
                }
            }
        }
        
        // 1. 출발점 -> 레버 최단 거리
        int toLever = bfs(start[0], start[1], 'L');
        if (toLever == -1) return -1;
        
        // 2. 레버 -> 출구 최단 거리
        int toEnd = bfs(lever[0], lever[1], 'E');
        if (toEnd == -1) return -1;
        
        return toLever + toEnd;
    }
    
    // BFS 탐색 함수
    private int bfs(int startX, int startY, char target) {
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();
        
        queue.add(new int[]{startX, startY, 0});
        visited[startX][startY] = true;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int time = current[2];
            
            // 목적지 도달 시 시간 반환
            if (map[x][y] == target) {
                return time;
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                // 범위를 벗어나지 않고, 벽('X')이 아니며, 방문하지 않은 곳
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (map[nx][ny] != 'X' && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny, time + 1});
                    }
                }
            }
        }
        
        // 도달할 수 없는 경우
        return -1;
    }
}
