class Solution {
    public long solution(int[] sequence) {
        long max = Long.MIN_VALUE;
        
        // 두 가지 펄스 수열 적용 결과값 저장 (1, -1, 1 ... 과 -1, 1, -1 ...)
        long sum1 = 0;
        long sum2 = 0;
        
        for (int i = 0; i < sequence.length; i++) {
            // 인덱스 홀/짝에 따라 1 또는 -1 곱하기
            int p1 = (i % 2 == 0) ? 1 : -1;
            int p2 = (i % 2 == 0) ? -1 : 1;
            
            // 카단 알고리즘 적용
            sum1 = Math.max(0, sum1) + (long) sequence[i] * p1;
            sum2 = Math.max(0, sum2) + (long) sequence[i] * p2;
            
            max = Math.max(max, Math.max(sum1, sum2));
        }
        
        return max;
    }
}
