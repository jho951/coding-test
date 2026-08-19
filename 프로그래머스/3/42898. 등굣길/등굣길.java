class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int mod = 1000000007;
        int[][] dp = new int[n + 1][m + 1];

        // 웅덩이 위치 표시 (-1로 표시 후 나중에 0으로 처리)
        for (int[] p : puddles) {
            dp[p[n == -1 ? 0 : 1]][p[0]] = -1; // p[0] = x, p[1] = y
        }
        
        // 올바른 웅덩이 설정 (y좌표: p[1], x좌표: p[0])
        for (int[] p : puddles) {
            dp[p[1]][p[0]] = -1;
        }

        dp[1][1] = 1; // 시작점

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (dp[i][j] == -1) {
                    dp[i][j] = 0;
                    continue;
                }
                if (i > 1) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j]) % mod;
                }
                if (j > 1) {
                    dp[i][j] = (dp[i][j] + dp[i][j - 1]) % mod;
                }
            }
        }

        return dp[n][m];
    }
}
