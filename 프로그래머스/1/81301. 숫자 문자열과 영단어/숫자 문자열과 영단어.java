import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int solution(String s) {
        Map<String, Integer> compareNum = new HashMap<>();
        compareNum.put("zero", 0);
        compareNum.put("one", 1);
        compareNum.put("two", 2);
        compareNum.put("three", 3);
        compareNum.put("four", 4);
        compareNum.put("five", 5);
        compareNum.put("six", 6);
        compareNum.put("seven", 7);
        compareNum.put("eight", 8);
        compareNum.put("nine", 9);

        for (Map.Entry<String, Integer> entry : compareNum.entrySet()) {
            s = s.replaceAll(entry.getKey(), entry.getValue().toString());
        }

        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        System.out.println(solution("one4seveneight")); // 예시 입력
    }
}
