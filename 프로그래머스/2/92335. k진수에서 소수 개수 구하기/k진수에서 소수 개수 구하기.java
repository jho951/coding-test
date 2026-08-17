class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        // 1. n을 k진수 문자열로 변환
        String kStr = Integer.toString(n, k);
        
        // 2. '0'을 기준으로 분할 ("0+"로 연속된 0을 한 번에 처리)
        String[] parts = kStr.split("0+");
        
        // 3. 분할된 각 숫자가 소수인지 확인
        for (String str : parts) {
            // 빈 문자열 방지 (0+를 쓰면 생기지 않지만 안전장치로 추가)
            if (str.equals("")) continue; 
            
            // int 범위를 초과할 수 있으므로 Long으로 파싱
            long num = Long.parseLong(str);
            
            if (isPrime(num)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    // 소수 판별 메서드 (O(√N) 시간복잡도)
    private boolean isPrime(long num) {
        if (num <= 1) return false;
        
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
