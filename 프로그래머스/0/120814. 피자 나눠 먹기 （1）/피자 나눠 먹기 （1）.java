class Solution {
    public int solution(int n) {
        int answer = 0;
        int plus = n % 7 == 0? 0: 1;
        answer = n / 7 + plus;
        return answer;
    }
}