import java.util.*;
class Solution {
    public int[] solution(String s) {
        int n = s.length();
        int[] answer = new int[n];
        Map<Character, Integer> last = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            Integer prev = last.get(c);
            answer[i] = (prev == null) ? -1 : i - prev;
            last.put(c, i);
        }
        return answer;
    }
}