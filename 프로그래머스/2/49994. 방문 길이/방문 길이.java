import java.util.HashSet;

class Solution {
    public int solution(String dirs) {
        // 상, 하, 좌, 우
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        String[] move = {"U", "D", "L", "R"};
        
        int curX = 5;
        int curY = 5;
        HashSet<String> visited = new HashSet<>();
        
        for (int i = 0; i < dirs.length(); i++) {
            int nextX = curX;
            int nextY = curY;
            
            // 방향 확인
            for (int j = 0; j < 4; j++) {
                if (String.valueOf(dirs.charAt(i)).equals(move[j])) {
                    nextX += dx[j];
                    nextY += dy[j];
                }
            }
            
            // 범위를 벗어나는 명령어는 무시
            if (nextX < 0 || nextX > 10 || nextY < 0 || nextY > 10) {
                continue;
            }
            
            // 양방향 경로를 모두 저장하여 중복 처리
            String path1 = curX + "" + curY + "" + nextX + "" + nextY;
            String path2 = nextX + "" + nextY + "" + curX + "" + curY;
            
            if (!visited.contains(path1)) {
                visited.add(path1);
                visited.add(path2);
            }
            
            curX = nextX;
            curY = nextY;
        }
        
        return visited.size() / 2;
    }
}
