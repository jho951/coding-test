import java.util.*;
import java.util.function.Function;

public class Solution {
    public static int solution(int[] depth, int money, Function<Integer, Integer> excavate) {
        int w = depth.length;
        
        // dp[i][j]: i열부터 j열(0-indexed) 사이에 보물이 있을 때 최악의 경우 최소 비용
        int[][] dp = new int[w][w];
        // pick[i][j]: i열부터 j열 사이에서 비용을 최소화하기 위해 선택해야 하는 최적의 열 인덱스
        int[][] pick = new int[w][w];
        
        // DP 진행 (구간의 길이 len을 1부터 w까지 늘려가며 계산)
        for (int len = 1; len <= w; len++) {
            for (int i = 0; i <= w - len; i++) {
                int j = i + len - 1;
                
                // 기저 조건: 구간의 길이가 1이면 자기 자신만 파면 끝남
                if (i == j) {
                    dp[i][j] = depth[i];
                    pick[i][j] = i;
                    continue;
                }
                
                int minCost = Integer.MAX_VALUE;
                int bestK = i;
                
                // i부터 j 사이의 k열을 첫 번째 분기점으로 삼아 최소 비용 탐색
                for (int k = i; k <= j; k++) {
                    int leftCost = (k > i) ? dp[i][k - 1] : 0;
                    int rightCost = (k < j) ? dp[k + 1][j] : 0;
                    
                    // 최악의 경우(더 큰 비용)를 상정하고 현재 k를 파는 비용 합산
                    int worstCost = depth[k] + Math.max(leftCost, rightCost);
                    
                    if (worstCost < minCost) {
                        minCost = worstCost;
                        bestK = k;
                    }
                }
                
                dp[i][j] = minCost;
                pick[i][j] = bestK;
            }
        }
        
        // DP로 찾아낸 최적의 경로를 따라 실제로 로봇에게 명령(excavate) 수행
        int left = 0;
        int right = w - 1;
        
        while (left <= right) {
            // 현재 구간에서 파야 할 최적의 열(0-indexed)
            int p = pick[left][right]; 
            
            // 문제에서 열 번호는 1부터 w까지이므로 1을 더해서 전달
            int result = excavate.apply(p + 1); 
            
            if (result == 0) {
                return p + 1; // 보물 발견! 해당 열 반환
            } else if (result == -1) {
                right = p - 1; // 보물이 왼쪽에 있음
            } else if (result == 1) {
                left = p + 1;  // 보물이 오른쪽에 있음
            }
        }
        
        return -1;
    }
}
