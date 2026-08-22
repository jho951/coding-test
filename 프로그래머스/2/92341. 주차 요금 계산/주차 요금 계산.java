import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> inTimeMap = new HashMap<>();
        Map<String, Integer> totalTimeMap = new TreeMap<>();

        for (String record : records) {
            String[] split = record.split(" ");
            int time = toMinute(split[0]);
            String carNumber = split[1];
            String status = split[2];

            if (status.equals("IN")) {
                inTimeMap.put(carNumber, time);
            } else {
                int inTime = inTimeMap.remove(carNumber);
                totalTimeMap.put(carNumber, totalTimeMap.getOrDefault(carNumber, 0) + (time - inTime));
            }
        }

        for (String carNumber : inTimeMap.keySet()) {
            int inTime = inTimeMap.get(carNumber);
            int outTime = 23 * 60 + 59;
            totalTimeMap.put(carNumber, totalTimeMap.getOrDefault(carNumber, 0) + (outTime - inTime));
        }

        int[] answer = new int[totalTimeMap.size()];
        int idx = 0;
        for (String carNumber : totalTimeMap.keySet()) {
            int totalTime = totalTimeMap.get(carNumber);
            answer[idx++] = calculateFee(totalTime, fees);
        }

        return answer;
    }

    private int toMinute(String timeStr) {
        String[] parts = timeStr.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }

    private int calculateFee(int totalTime, int[] fees) {
        int basicTime = fees[0];
        int basicFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];

        if (totalTime <= basicTime) {
            return basicFee;
        }

        double excessTime = totalTime - basicTime;
        return basicFee + (int) Math.ceil(excessTime / unitTime) * unitFee;
    }
}
