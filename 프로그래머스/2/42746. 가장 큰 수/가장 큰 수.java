import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        // (s2 + s1).compareTo(s1 + s2)를 이용해 내림차순 정렬
        Arrays.sort(strNumbers, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        // 가장 큰 수가 '0'인 경우 (예: [0, 0, 0])
        if (strNumbers[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String num : strNumbers) {
            sb.append(num);
        }

        return sb.toString();
    }
}
