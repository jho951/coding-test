import java.util.*;

class Solution {
    static char[][] map;
    static boolean[][] visited;
    static int n, m;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public int[] solution(String[] maps) {
        n = maps.length;
        m = maps[0].length();
        map = new char[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            map[i] = maps[i].toCharArray();
        }

        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && map[i][j] != 'X') {
                    int sum = dfs(i, j);
                    answerList.add(sum);
                }
            }
        }

        if (answerList.isEmpty()) {
            return new int[]{-1};
        }

        Collections.sort(answerList);

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    private int dfs(int x, int y) {
        visited[x][y] = true;
        int sum = map[x][y] - '0'; // 문자 형태의 숫자를 정수형으로 변환

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if (!visited[nx][ny] && map[nx][ny] != 'X') {
                    sum += dfs(nx, ny);
                }
            }
        }

        return sum;
    }
}
