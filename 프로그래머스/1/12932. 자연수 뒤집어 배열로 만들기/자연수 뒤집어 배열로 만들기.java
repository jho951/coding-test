class Solution {
    public int[] solution(long n) {
        String[] stringN = String.valueOf(n).split("");
        int[] answer = new int[stringN.length];
        
        for(int i = stringN.length - 1; i >= 0; i--){
            answer[stringN.length - 1 - i] = Integer.parseInt(stringN[i]);
        }
        return answer;
    }
}