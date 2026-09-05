import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        // 유저 아이디(uid)와 닉네임을 저장하는 맵
        Map<String, String> uidMap = new HashMap<>();
        // 명령어(Enter, Leave, Change)와 uid 기록을 저장하는 리스트
        List<String[]> history = new ArrayList<>();
        
        for (String r : record) {
            String[] split = r.split(" ");
            String command = split[0];
            String uid = split[1];
            
            if (!command.equals("Leave")) {
                String nickname = split[2];
                uidMap.put(uid, nickname); // 최신 닉네임으로 갱신
            }
            
            if (!command.equals("Change")) {
                history.add(new String[]{command, uid});
            }
        }
        
        // 결과 메시지 생성
        List<String> result = new ArrayList<>();
        for (String[] h : history) {
            String command = h[0];
            String uid = h[1];
            String name = uidMap.get(uid);
            
            if (command.equals("Enter")) {
                result.add(name + "님이 들어왔습니다.");
            } else if (command.equals("Leave")) {
                result.add(name + "님이 나갔습니다.");
            }
        }
        
        return result.toArray(new String[0]);
    }
}
