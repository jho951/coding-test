class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder(); // 문자열 생성 최적화
        int mode = 0; // 초기 모드: 0

        for (int i = 0; i < code.length(); i++) {
            char currentChar = code.charAt(i); // 현재 문자

            if (mode == 0) {
                if (currentChar == '1') {
                    mode = 1; // 모드 전환
                } else if (i % 2 == 0) {
                    answer.append(currentChar); // 짝수 인덱스 추가
                }
            } else if (mode == 1) {
                if (currentChar == '1') {
                    mode = 0; // 모드 전환
                } else if (i % 2 != 0) {
                    answer.append(currentChar); // 홀수 인덱스 추가
                }
            }
        }

        // 문자열이 비었는지 확인
        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}
