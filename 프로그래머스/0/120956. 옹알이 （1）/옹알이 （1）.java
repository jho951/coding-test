import java.util.*;

class Solution {
    private static final String[] SYLS = {"aya", "ye", "woo", "ma"};
    private static final Set<String> VALID = buildValidSet();

    public int solution(String[] babbling) {
        int cnt = 0;
        for (String w : babbling) {
            if (VALID.contains(w)) cnt++;
        }
        return cnt;
    }

    // 허용 음절을 중복 없이 1~4개 이어붙인 모든 경우 생성
    private static Set<String> buildValidSet() {
        Set<String> set = new HashSet<>();
        boolean[] used = new boolean[SYLS.length];
        dfs(set, new StringBuilder(), used, 0);
        return set;
    }

    private static void dfs(Set<String> set, StringBuilder cur, boolean[] used, int depth) {
        if (depth > 0) set.add(cur.toString());        // 길이 1~4 모두 추가
        if (depth == SYLS.length) return;              // 최대 4개까지

        for (int i = 0; i < SYLS.length; i++) {
            if (used[i]) continue;                     // 중복 금지
            used[i] = true;
            int lenBefore = cur.length();
            cur.append(SYLS[i]);
            dfs(set, cur, used, depth + 1);
            cur.setLength(lenBefore);
            used[i] = false;
        }
    }
}
