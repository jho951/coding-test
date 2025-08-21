class Solution {
 public static int solution(String dartResult) {
        int[] scores = new int[3]; // 3번 라운드
        int idx = 0; // 현재 라운드
        int i = 0;   // 문자열 인덱스

        while (i < dartResult.length()) {
            int num;

            // 10 처리 (두 자리 수)
            if (i + 1 < dartResult.length() && dartResult.charAt(i) == '1' && dartResult.charAt(i + 1) == '0') {
                num = 10;
                i += 2;
            } else {
                num = dartResult.charAt(i) - '0';
                i++;
            }

            // 보너스
            char bonus = dartResult.charAt(i++);
            if (bonus == 'S') num = (int) Math.pow(num, 1);
            else if (bonus == 'D') num = (int) Math.pow(num, 2);
            else if (bonus == 'T') num = (int) Math.pow(num, 3);

            // 옵션 확인 (*, #)
            if (i < dartResult.length()) {
                char option = dartResult.charAt(i);
                if (option == '*') {
                    num *= 2;
                    if (idx > 0) scores[idx - 1] *= 2; // 이전 점수도 2배
                    i++;
                } else if (option == '#') {
                    num *= -1;
                    i++;
                }
            }

            scores[idx++] = num; // 점수 저장
        }

        return scores[0] + scores[1] + scores[2];
    }
}