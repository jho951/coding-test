import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 1. 결과 배열 및 유저 인덱스 맵 초기화
        int[] answer = new int[id_list.length];
        Map<String, Integer> idIdxMap = new HashMap<>();
        // 신고당한 유저 : 자신을 신고한 유저들의 Set
        Map<String, Set<String>> reportedMap = new HashMap<>();
        
        for (int i = 0; i < id_list.length; i++) {
            idIdxMap.put(id_list[i], i);
            reportedMap.put(id_list[i], new HashSet<>());
        }
        
        // 2. 중복 없는 신고 기록 처리
        for (String rep : report) {
            String[] split = rep.split(" ");
            String fromUser = split[0]; // 신고한 사람
            String toUser = split[1];   // 신고당한 사람
            
            // 신고당한 사람의 Set에 신고한 사람 추가
            reportedMap.get(toUser).add(fromUser);
        }
        
        // 3. k번 이상 신고된 유저를 찾고 메일 횟수 누적
        for (String name : id_list) {
            Set<String> reporters = reportedMap.get(name);
            // 자신을 신고한 유저 수가 k명 이상인 경우
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    // 신고한 유저의 인덱스를 찾아 결과 값 증가
                    int idx = idIdxMap.get(reporter);
                    answer[idx]++;
                }
            }
        }
        
        return answer;
    }
}
