class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] a = cipher.split("");
        for(int i = 1; i<= a.length; i++){
           if(i % code == 0){
               answer+= a[i-1];
           }
        }
        return answer;
    }
}