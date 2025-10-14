class Solution {
    public int[] solution(String s) {
        int transformCnt = 0; // 이진 변환 횟수
        int removedZeros = 0; // 제거된 0의 총 개수

        while (!s.equals("1")) {
            // 1) 현재 문자열에서 0의 개수를 세고 제거 수 누적
            int zeros = 0;
            for (int i = 0, n = s.length(); i < n; i++) {
                if (s.charAt(i) == '0') zeros++;
            }
            removedZeros += zeros;

            // 2) 남은 1의 개수(= 길이 - 0 개수)를 2진수 문자열로 변환
            int ones = s.length() - zeros;
            s = Integer.toBinaryString(ones);

            // 3) 변환 횟수 증가
            transformCnt++;
        }

        return new int[]{transformCnt, removedZeros};
    }
}
