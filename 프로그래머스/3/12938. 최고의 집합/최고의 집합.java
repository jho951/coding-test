import java.util.Arrays;

class Solution {
    public int[] solution(int n, int s) {
        // 합이 n보다 작으면 최고의 집합이 존재하지 않음
        if (s < n) {
            return new int[] { -1 };
        }

        int[] answer = new int[n];
        int val = s / n;
        int rest = s % n;

        // 기본 몫으로 배열 채우기
        Arrays.fill(answer, val);

        // 나머지를 뒤에서부터 1씩 배분
        for (int i = n - rest; i < n; i++) {
            answer[i]++;
        }

        return answer;
    }
}
