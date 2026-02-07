import java.util.*;

class Solution {
    public int solution(int[][] info, int n, int m) {
        int[] dp = new int[m];
        int INF = 1000000;
        Arrays.fill(dp, INF);
        dp[0] = 0;

        for (int[] item : info) {
            int aTrace = item[0];
            int bTrace = item[1];

            for (int j = m - 1; j >= 0; j--) {
                if (j >= bTrace) {
                    dp[j] = Math.min(dp[j] + aTrace, dp[j - bTrace]);
                } 
                else {
                    dp[j] = dp[j] + aTrace;
                }
            }
        }
        int answer = INF;
        for (int j = 0; j < m; j++) {
            if (dp[j] < n) {
                answer = Math.min(answer, dp[j]);
            }
        }

        return (answer == INF) ? -1 : answer;
    }
}