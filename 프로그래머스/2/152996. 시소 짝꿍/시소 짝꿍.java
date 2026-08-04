import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        Arrays.sort(weights); //
        Map<Double, Integer> map = new HashMap<>(); //
        
        for (int w : weights) {
            // 가능한 4가지 비율(1:1, 2:3, 1:2, 3:4)에 따른 짝꿍 무게 계산
            if (map.containsKey((double)w)) answer += map.get((double)w);
            if (map.containsKey(w * 2.0 / 3.0)) answer += map.get(w * 2.0 / 3.0);
            if (map.containsKey(w * 1.0 / 2.0)) answer += map.get(w * 1.0 / 2.0);
            if (map.containsKey(w * 3.0 / 4.0)) answer += map.get(w * 3.0 / 4.0);
            
            map.put((double)w, map.getOrDefault((double)w, 0) + 1);
        }
        return answer;
    }
}
