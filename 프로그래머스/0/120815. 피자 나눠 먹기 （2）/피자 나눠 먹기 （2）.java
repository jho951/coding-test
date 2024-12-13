class Solution {
    public int solution(int n) {
        int answer = 0;
        int lcm = 1; 
        while(true){
            if((lcm % n == 0) && (lcm % 6 == 0)){
            break;
            }
        lcm++;
        }
        return answer = lcm / 6;
    }
}