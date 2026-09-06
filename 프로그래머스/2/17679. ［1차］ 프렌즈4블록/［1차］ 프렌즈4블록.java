import java.util.*;

class Solution {
    public int solution(int m, int n, String[] board) {
        char[][] map = new char[m][n];
        for (int i = 0; i < m; i++) {
            map[i] = board[i].toCharArray();
        }

        int answer = 0;

        while (true) {
            boolean[][] target = new boolean[m][n];
            int count = 0;

            // 1. 2x2 같은 블록 찾기
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    char c = map[i][j];
                    if (c == ' ') continue;
                    
                    if (map[i][j + 1] == c && map[i + 1][j] == c && map[i + 1][j + 1] == c) {
                        target[i][j] = true;
                        target[i][j + 1] = true;
                        target[i + 1][j] = true;
                        target[i + 1][j + 1] = true;
                    }
                }
            }

            // 2. 지울 블록 개수 세기 및 지우기
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (target[i][j]) {
                        map[i][j] = ' ';
                        count++;
                    }
                }
            }

            // 지워진 블록이 없다면 종료
            if (count == 0) break;
            answer += count;

            // 3. 블록 아래로 내리기
            for (int j = 0; j < n; j++) {
                for (int i = m - 1; i >= 0; i--) {
                    if (map[i][j] == ' ') {
                        // 위쪽에서 가장 가까운 블록 찾기
                        for (int k = i - 1; k >= 0; k--) {
                            if (map[k][j] != ' ') {
                                map[i][j] = map[k][j];
                                map[k][j] = ' ';
                                break;
                            }
                        }
                    }
                }
            }
        }

        return answer;
    }
}
