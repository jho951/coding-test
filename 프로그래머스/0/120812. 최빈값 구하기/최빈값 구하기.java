import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int solution(int[] array) {
        // 1. 숫자 빈도를 저장할 HashMap
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // 2. 배열을 순회하며 각 숫자의 빈도를 계산
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // 3. 가장 큰 빈도 찾기
        int maxCount = 0;
        for (int count : frequencyMap.values()) {
            maxCount = Math.max(maxCount, count);
        }

        // 4. 최빈값이 여러 개일 경우 -1을 반환
        int modeCount = 0;
        int mode = -1;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                modeCount++;
                mode = entry.getKey();
            }
        }

        // 최빈값이 여러 개이면 -1을 반환
        return (modeCount > 1) ? -1 : mode;
    }

}
