class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] parameter = rsp.split("");
        for(int i = 0; i< parameter.length; i++){
            switch(parameter[i]){
                case "2":{
                    answer += "0";
                    break;
                }case "5":{
                    answer += "2";
                    break;
                }case "0":{
                    answer += "5";
                    break;
                }default : break;
            }
        }
        return answer;
    }
}