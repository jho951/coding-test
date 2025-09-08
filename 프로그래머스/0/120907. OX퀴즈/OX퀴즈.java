class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i< quiz.length; i++){
            String[] temp = quiz[i].split(" = ");
            String[] compare = temp[0].split(" ");
            int result = Integer.parseInt(temp[1]);
            int compareResult = 0;
            if(compare[1].equals("+")){
              compareResult = Integer.parseInt(compare[0]) + Integer.parseInt(compare[2]);
            }else{
              compareResult = Integer.parseInt(compare[0]) - Integer.parseInt(compare[2]);
            }
            if(compareResult == result){
                answer[i] = "O";
            }else{
                answer[i] = "X"; 
            }
        }
 
        return answer;
    }
}

