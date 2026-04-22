import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> map = new HashMap<>();
            for (int k = 0; k < want.length; k++) {
                map.put(want[k], number[k]);
            }

            for (int j = i; j < i + 10; j++) {
                String item = discount[j];
                if (map.containsKey(item)) {
                    map.computeIfPresent(item, (k, v) -> v == 1 ? null : v - 1);
                }
            }

            if (map.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
