class Solution {
    public int solution(String my_string) {
        String[] aa = my_string.split(""); // 문자열을 배열로 분리
        int answer = 0; // 결과 문자열 초기화
        
        for (int i = 0; i < aa.length; i++) {
            char ch = aa[i].charAt(0); // 배열의 i번째 요소에서 첫 번째 문자를 가져옴
            if (Character.isDigit(ch)) { // 숫자인지 확인
                answer += Character.getNumericValue(ch);
            }
        }
        
        return answer; // 반복이 끝난 후 최종 결과 반환
    }
}
