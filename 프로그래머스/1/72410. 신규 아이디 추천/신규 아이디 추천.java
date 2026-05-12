class Solution {
    public String solution(String new_id) {
        // 1단계: 소문자 치환, 2단계: 문자 제거, 3단계: 연속 마침표 치환
        String answer = new_id.toLowerCase()
                             .replaceAll("[^-_.a-z0-9]", "")
                             .replaceAll("[.]{2,}", ".");
        
        // 4단계: 처음/끝 마침표 제거
        answer = answer.replaceAll("^[.]|[.]$", "");

        // 5단계: 빈 문자열 처리
        if (answer.isEmpty()) answer = "a";

        // 6단계: 길이 제한 및 끝 마침표 재제거
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15).replaceAll("[.]$", "");
        }

        // 7단계: 길이 3까지 마지막 문자 채우기
        while (answer.length() < 3) {
            answer += answer.charAt(answer.length() - 1);
        }
        return answer;
    }
}
