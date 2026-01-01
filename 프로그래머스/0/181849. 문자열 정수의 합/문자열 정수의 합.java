class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] s = num_str.split("");
        for(int i = 0; i< s.length; i++){
            answer += Integer.parseInt(s[i]);
        }
        return answer;
    }
}