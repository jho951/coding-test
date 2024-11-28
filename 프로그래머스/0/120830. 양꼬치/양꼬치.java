class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        if (n >= 10) {
            answer = n * 12000 + k * 2000 - n / 10 * 2000;  // 기본 계산 + 할인 적용
        } else {
            answer = n * 12000 + k * 2000;  // 기본 계산
        }
        return answer;
    }
}
