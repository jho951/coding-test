class Solution {
    public float solution(int num1, int num2) {
        // num2가 0일 경우 예외 처리
        if (num2 == 0) {
            return -1; // 또는 다른 적절한 값이나 예외를 던질 수 있습니다.
        }
        
        // 나눗셈 결과를 소수점 이하 3자리까지 계산
        return (float)Math.floor((float) num1 / num2 * 1000);
    }
}
