class Solution {
    public long solution(long n) {
         long x = (long) Math.sqrt(n);
        if (x * x == n) { // 제곱근을 다시 제곱했을 때 n과 같은지 확인
            return (x + 1) * (x + 1);
        }
        return -1;
    }
}