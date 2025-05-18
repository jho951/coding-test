import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> answerList = new ArrayList<>();

        for(int i = 0; i < names.length; i++){
            if(i % 5 == 0) {
                answerList.add(names[i]);
            }
        }

        String[] answer = new String[answerList.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}