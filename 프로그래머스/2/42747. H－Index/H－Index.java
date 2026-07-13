import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        // 논문 인용 횟수를 오름차순으로 정렬
        Arrays.sort(citations);
        
        int answer = 0;
        for (int i = 0; i < citations.length; i++) {
            // h번 이상 인용된 논문의 수 계산
            int h = citations.length - i;
            
            // h번 이상 인용된 논문이 h편 이상인지 확인
            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }
        return answer;
    }
}
