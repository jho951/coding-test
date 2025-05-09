import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String[] stringN = String.valueOf(n).split("");
        
        for(String i : stringN){
            answer+= Integer.parseInt(i);
        }
        
        return answer;
    }
}