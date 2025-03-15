class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        String[] splitCode = code.split("");
        for(int i = r; i< splitCode.length; i += q){
           answer += splitCode[i];
        }
        return answer;
    }
}