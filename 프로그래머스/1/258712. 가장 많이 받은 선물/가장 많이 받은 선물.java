import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        Map<String, Integer> map = new HashMap<>();
        
        // 1. 친구 이름별 인덱스 부여
        for (int i = 0; i < n; i++) {
            map.put(friends[i], i);
        }
        
        int[][] giftGraph = new int[n][n]; // 선물 주고받은 기록
        int[] giftScore = new int[n];      // 선물 지수
        
        // 2. 선물 기록 및 선물 지수 초기화
        for (String gift : gifts) {
            String[] split = gift.split(" ");
            int giver = map.get(split[0]);
            int receiver = map.get(split[1]);
            
            giftGraph[giver][receiver]++;
            giftScore[giver]++;
            giftScore[receiver]--;
        }
        
        int[] nextMonthGifts = new int[n]; // 다음 달에 받을 선물의 수
        
        // 3. 규칙에 따라 다음 달에 받을 선물 계산
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                
                // 규칙 1: i가 j에게 준 선물이 j가 i에게 준 선물보다 많은 경우
                if (giftGraph[i][j] > giftGraph[j][i]) {
                    nextMonthGifts[i]++;
                } 
                // 규칙 2: 주고받은 수가 같거나 아예 없는 경우
                else if (giftGraph[i][j] == giftGraph[j][i]) {
                    if (giftScore[i] > giftScore[j]) {
                        nextMonthGifts[i]++;
                    }
                }
            }
        }
        
        // 4. 다음 달에 가장 많이 받을 선물의 개수 반환
        int answer = 0;
        for (int giftCount : nextMonthGifts) {
            answer = Math.max(answer, giftCount);
        }
        
        return answer;
    }
}