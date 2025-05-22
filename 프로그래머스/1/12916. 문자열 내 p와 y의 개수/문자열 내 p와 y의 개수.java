class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s= s.toLowerCase();
        int p = 0;
        int y = 0;
        String[] l = s.split("");
        for(int i = 0; i< l.length; i++){
            if(l[i].equals("p")){
                p++;
            }else if(l[i].equals("y")){
                y++;
            }
        }
        if(p != y){
            answer = false;
        }
        return answer;
    }
}