class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int left = 10;  // '*' 위치
        int right = 12; // '#' 위치

        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                answer.append("L");
                left = num;
            } else if (num == 3 || num == 6 || num == 9) {
                answer.append("R");
                right = num;
            } else {
                if (num == 0) num = 11;
                // 거리 계산 (숫자 11은 0을 의미)
                int leftDist = Math.abs(num - left) / 3 + Math.abs(num - left) % 3;
                int rightDist = Math.abs(num - right) / 3 + Math.abs(num - right) % 3;

                if (leftDist < rightDist) {
                    answer.append("L");
                    left = num;
                } else if (rightDist < leftDist) {
                    answer.append("R");
                    right = num;
                } else {
                    if (hand.equals("right")) {
                        answer.append("R");
                        right = num;
                    } else {
                        answer.append("L");
                        left = num;
                    }
                }
            }
        }
        return answer.toString();
    }
}
