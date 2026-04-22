import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> set = new HashSet<>(); 
        set.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            String prevWord = words[i - 1];
            String currWord = words[i];  
            
            if (set.contains(currWord) || 
                prevWord.charAt(prevWord.length() - 1) != currWord.charAt(0)) {
            
                return new int[]{(i % n) + 1, (i / n) + 1};
            }

            set.add(currWord);
        }

        return new int[]{0, 0};
    }
}
