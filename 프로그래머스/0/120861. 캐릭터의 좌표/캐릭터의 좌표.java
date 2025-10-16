class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int maxW = (board[0] - 1) / 2;
        int maxH = (board[1] - 1) / 2;
        int[] answer = {0,0};
        for(int i = 0; i< keyinput.length; i++){
            if(keyinput[i].equals("left")){
                if(answer[0] <= -maxW) continue;
                answer[0]--;
            }else if(keyinput[i].equals("right")){
                if(answer[0] >= maxW) continue;
                answer[0]++;
            }else if(keyinput[i].equals("up")){
                if(answer[1] >= maxH) continue;
                answer[1]++; 
            }else{
                if(answer[1] <= -maxH) continue;
                answer[1]--;
            }
        }
        return answer;
    }
}