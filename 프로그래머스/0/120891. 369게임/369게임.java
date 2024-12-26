class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] orderString = (order+ "").split("");
        for(int i = 0; i< orderString.length; i++){
            if(orderString[i].equals("3") || orderString[i].equals("6") || orderString[i].equals("9")){
                answer++;
            }
        }
        return answer;
    }
}