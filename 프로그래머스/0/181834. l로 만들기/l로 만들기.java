class Solution {
    public String solution(String myString) {
        String[] answer = myString.split(""); 
        String result = "";
        char compare = 'l';
        for(int i = 0; i < answer.length; i++){
            char currentChar = answer[i].charAt(0); 
            if(currentChar < compare){
                result += "l"; 
            } else {
                result += answer[i]; 
            }
        }
        return result;
    }
}
