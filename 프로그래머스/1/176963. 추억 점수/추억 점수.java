import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for (int i = 0; i < photo.length; i++) {
            int number = 0;
            for (String item : photo[i]) {
                for (int j = 0; j < name.length; j++) {
                    if (name[j].equals(item)) {
                        number += yearning[j];
                    }
                }
            }
            answer[i] = number;
        }
        
        return answer;
    }
}