import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        // 성격 유형별 점수를 저장할 맵
        Map<Character, Integer> scoreMap = new HashMap<>();
        char[] types = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        for (char t : types) scoreMap.put(t, 0);

        // 설문 결과 계산
        for (int i = 0; i < survey.length; i++) {
            int choice = choices[i];
            if (choice > 4) {
                // 5, 6, 7번 선택 시 오른쪽 유형에 점수 부여
                char target = survey[i].charAt(1);
                scoreMap.put(target, scoreMap.get(target) + choice - 4);
            } else if (choice < 4) {
                // 1, 2, 3번 선택 시 왼쪽 유형에 점수 부여
                char target = survey[i].charAt(0);
                scoreMap.put(target, scoreMap.get(target) + 4 - choice);
            }
        }

        // 지표별 비교 후 최종 결과 조합
        StringBuilder answer = new StringBuilder();
        answer.append(scoreMap.get('R') >= scoreMap.get('T') ? "R" : "T");
        answer.append(scoreMap.get('C') >= scoreMap.get('F') ? "C" : "F");
        answer.append(scoreMap.get('J') >= scoreMap.get('M') ? "J" : "M");
        answer.append(scoreMap.get('A') >= scoreMap.get('N') ? "A" : "N");

        return answer.toString();
    }
}
