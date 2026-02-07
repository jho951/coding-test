import java.util.*;

class Solution {
    public int solution(int[][] info, int n, int m) {
        // dp[j]는 B의 흔적이 j일 때 A 흔적의 최솟값
        int[] dp = new int[m];
        int INF = 1000000; // 충분히 큰 값 (n의 최대가 120,000이므로)
        Arrays.fill(dp, INF);
        dp[0] = 0;

        for (int[] item : info) {
            int aTrace = item[0];
            int bTrace = item[1];

            // 뒤에서부터 계산해야 이전 물건의 결과에 영향을 받지 않음 (1차원 DP 기법)
            for (int j = m - 1; j >= 0; j--) {
                // 1. B가 훔치는 경우: j >= bTrace일 때만 가능
                if (j >= bTrace) {
                    dp[j] = Math.min(dp[j] + aTrace, dp[j - bTrace]);
                } 
                // 2. A가 훔치는 경우: 항상 가능하지만 A의 흔적만 추가됨
                else {
                    dp[j] = dp[j] + aTrace;
                }
            }
        }

        // 결과 탐색: A의 흔적이 n 미만인 경우 중 최솟값 찾기
        int answer = INF;
        for (int j = 0; j < m; j++) {
            if (dp[j] < n) {
                answer = Math.min(answer, dp[j]);
            }
        }

        return (answer == INF) ? -1 : answer;
    }
}