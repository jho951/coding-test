import java.util.Arrays;

class Solution {
    public int solution(int x, int y, int n) {
        int[] dp = new int[y + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        
        dp[x] = 0; // 시작점은 연산 횟수 0
        
        for (int i = x; i <= y; i++) {
            if (dp[i] == Integer.MAX_VALUE) {
                continue; // 도달할 수 없는 숫자면 패스
            }
            
            // x + n 연산
            if (i + n <= y) {
                dp[i + n] = Math.min(dp[i + n], dp[i] + 1);
            }
            // x * 2 연산
            if (i * 2 <= y) {
                dp[i * 2] = Math.min(dp[i * 2], dp[i] + 1);
            }
            // x * 3 연산
            if (i * 3 <= y) {
                dp[i * 3] = Math.min(dp[i * 3], dp[i] + 1);
            }
        }
        
        return dp[y] == Integer.MAX_VALUE ? -1 : dp[y];
    }
}
