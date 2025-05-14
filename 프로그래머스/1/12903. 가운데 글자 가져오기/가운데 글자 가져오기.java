import java.util.*;

class Solution {
    public String solution(String s) {
        List<String> list = new ArrayList<>(List.of(s.split("")));
        int middleIndex = list.size() / 2;
        String answer = "";
        
        if(list.size() % 2 == 0){
            // 짝수일 때
            answer += list.get(middleIndex - 1);
            answer += list.get(middleIndex);
        }else{
            // 홀수일 때
            answer += list.get(middleIndex);
        }
        
        return answer;
    }
}