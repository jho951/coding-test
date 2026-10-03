import java.util.*;

class Solution {
    String[] u_ids;
    String[] b_ids;
    HashSet<String> set = new HashSet<>();
    boolean[] visited;

    public int solution(String[] user_id, String[] banned_id) {
        u_ids = user_id;
        b_ids = banned_id;
        visited = new boolean[user_id.length];

        dfs(0, "");

        return set.size();
    }

    public void dfs(int depth, String result) {
        // banned_id를 모두 매칭한 경우
        if (depth == b_ids.length) {
            String[] arr = result.split(",");
            Arrays.sort(arr); // 순서가 달라도 구성이 같으면 같은 Set으로 처리하기 위해 정렬
            StringBuilder sb = new StringBuilder();
            for (String s : arr) sb.append(s);
            set.add(sb.toString());
            return;
        }

        // 현재 banned_id(b_ids[depth])와 매칭할 수 있는 user_id 찾기
        for (int i = 0; i < u_ids.length; i++) {
            if (!visited[i] && isMatch(u_ids[i], b_ids[depth])) {
                visited[i] = true;
                dfs(depth + 1, result + u_ids[i] + ",");
                visited[i] = false; // 백트래킹
            }
        }
    }

    // 아이디가 불량 사용자 아이디 패턴과 일치하는지 확인하는 함수
    public boolean isMatch(String userId, String bannedId) {
        if (userId.length() != bannedId.length()) return false;

        for (int i = 0; i < userId.length(); i++) {
            if (bannedId.charAt(i) == '*') continue;
            if (userId.charAt(i) != bannedId.charAt(i)) return false;
        }
        return true;
    }
}
