class Solution {
    public int solution(int storey) {
        int answer = 0;
        
        while (storey > 0) {
            int remainder = storey % 10; // 현재 자릿수의 숫자
            int next = (storey / 10) % 10; // 다음 자릿수의 숫자
            
            if (remainder > 5) {
                answer += (10 - remainder);
                storey += 10; // 올림 처리
            } else if (remainder < 5) {
                answer += remainder;
            } else { // remainder == 5
                if (next >= 5) {
                    answer += (10 - remainder);
                    storey += 10; // 다음 자리가 5 이상이면 올림
                } else {
                    answer += remainder; // 다음 자리가 5 미만이면 내림
                }
            }
            storey /= 10;
        }
        
        return answer;
    }
}
