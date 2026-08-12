import java.util.*;

class Solution {
    public long solution(int[][] cost, int[][] hint) {
        int N = cost.length;       // 스테이지의 개수
        int M = hint.length;       // 번들의 개수 (N - 1)
        int maxMask = 1 << M;      // 번들을 구매하는 모든 경우의 수 (2^M)
        
        long answer = Long.MAX_VALUE; // 최소 비용을 구하기 위해 최대값으로 초기화

        // 1. 모든 비트마스크(번들 구매 조합)를 완전 탐색
        for (int m = 0; m < maxMask; m++) {
            long totalCost = 0;
            int[] hintCnt = new int[N]; // 각 스테이지별 보유하게 될 힌트권 개수

            // 2. 현재 선택된 조합(m)에서 구매할 번들의 비용과 힌트권 집계
            for (int i = 0; i < M; i++) {
                // m의 i번째 비트가 1이라면, i번 스테이지의 번들을 구매한 것
                if (((m >> i) & 1) == 1) {
                    totalCost += hint[i][0]; // 번들 가격 누적
                    
                    // 번들에 포함된 힌트권들을 스테이지별 카운트에 추가
                    for (int j = 1; j < hint[i].length; j++) {
                        int stageNum = hint[i][j] - 1; // 1-index를 0-index로 변환
                        hintCnt[stageNum]++;
                    }
                }
            }

            // 3. 각 스테이지를 클리어하는 비용 계산 및 누적
            for (int i = 0; i < N; i++) {
                // 보유한 힌트권 개수가 N-1개를 초과하면 최댓값(N-1)으로 고정 (오버플로우 방지)
                int useHint = Math.min(hintCnt[i], N - 1);
                totalCost += cost[i][useHint];
            }

            // 4. 전체 조합 중 최소 비용을 갱신
            answer = Math.min(answer, totalCost);
        }

        return answer;
    }
}
