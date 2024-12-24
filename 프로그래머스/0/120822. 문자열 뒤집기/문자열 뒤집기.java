class Solution {
    public String solution(String my_string) {
        String[] stringSpliter = my_string.split("");
        String answer ="";
        for(int i = stringSpliter.length - 1; i >= 0; i-- ){
            answer += stringSpliter[i];
        }
        return answer;
    }
}