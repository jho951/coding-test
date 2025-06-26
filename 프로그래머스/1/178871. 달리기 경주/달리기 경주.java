import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> playerMap = new HashMap<>();
        List<String> playerList = new ArrayList<>();
        // 플레이어와 인덱스를 해시 맵에 저장
        for (int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i);
            playerList.add(players[i]);
        }
        // 호출된 플레이어 처리
        for (String calling : callings) {
            Integer idx = playerMap.get(calling);
            // 인덱스가 0보다 클 경우에만 교환 수행
            if (idx != null && idx > 0) {
                String prevPlayer = playerList.get(idx - 1);
                // 플레이어와 이전 플레이어의 인덱스 교환
                playerList.set(idx, prevPlayer);
                playerList.set(idx - 1, calling);
                // 해시 맵 업데이트
                playerMap.put(calling, idx - 1);
                playerMap.put(prevPlayer, idx);
            }
        }
        // 결과 배열로 변환
        return playerList.toArray(new String[0]);
    }
}
