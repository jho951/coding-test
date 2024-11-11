import java.util.Arrays;

public class Solution {
    public int solution(int k, int m, int[] score) {
        // 내림차순으로 정렬
        Arrays.sort(score);
        for (int i = 0; i < score.length / 2; i++) {
            int temp = score[i];
            score[i] = score[score.length - 1 - i];
            score[score.length - 1 - i] = temp;
        }

        int answer = 0;

        // m 번째마다의 값 선택 후 answer 계산
        for (int i = m - 1; i < score.length; i += m) {
            answer += m * score[i];
        }

        return answer;
    }

}
