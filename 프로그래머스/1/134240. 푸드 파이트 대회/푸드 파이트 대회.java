class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i< food.length; i++){
            for(int j = 0; j< food[i] / 2; j++){
                answer+= i;
            }
        }
        answer += "0";
        
        char[] chars = answer.toCharArray();
        
        for(int z = chars.length - 2; z >= 0; z--){
            answer += chars[z];
        }
        return answer;
    }
}