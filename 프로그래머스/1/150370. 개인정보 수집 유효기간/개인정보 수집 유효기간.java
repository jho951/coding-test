import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answerList = new ArrayList<>();
        
        // 1. 오늘 날짜를 일(Day) 단위의 정수로 변환
        int todayDays = getDays(today);
        
        // 2. 약관 종류별 유효기간을 HashMap에 저장
        Map<String, Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] splitTerm = term.split(" ");
            String type = splitTerm[0];
            int month = Integer.parseInt(splitTerm[1]);
            termMap.put(type, month * 28); // 달 수를 '일' 단위로 변환하여 저장
        }
        
        // 3. 개인정보 배열을 순회하며 만료 여부 확인
        for (int i = 0; i < privacies.length; i++) {
            String[] splitPrivacy = privacies[i].split(" ");
            int collectDays = getDays(splitPrivacy[0]); // 수집일 변환
            String termType = splitPrivacy[1];         // 약관 종류
            
            // 만료일 계산: 수집일(일) + 유효기간(일)
            int expireDays = collectDays + termMap.get(termType);
            
            // 만료일이 오늘 날짜보다 작거나 같으면 파기 대상 (당일부터 파기 가능)
            if (expireDays <= todayDays) {
                answerList.add(i + 1); // 번호는 1번부터 시작하므로 i + 1
            }
        }
        
        // List를 int[] 배열로 변환하여 반환
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
    
    // "YYYY.MM.DD" 문자열을 총 일수로 변환하는 헬퍼 메서드
    private int getDays(String date) {
        String[] splitDate = date.split("\\.");
        int year = Integer.parseInt(splitDate[0]);
        int month = Integer.parseInt(splitDate[1]);
        int day = Integer.parseInt(splitDate[2]);
        
        return (year * 12 * 28) + (month * 28) + day;
    }
}
