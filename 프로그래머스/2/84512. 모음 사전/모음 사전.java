import java.util.ArrayList;
import java.util.List;

class Solution {
    // 생성된 모든 단어를 저장할 리스트
    static List<String> list = new ArrayList<>();
    // 사전에 사용되는 모음 배열
    static String[] vowels = {"A", "E", "I", "O", "U"};

    public int solution(String word) {
        // 리스트 초기화 (테스트 케이스마다 정적 리스트가 누적되지 않도록 방지)
        list.clear();
        
        // 빈 문자열부터 시작하여 깊이(길이) 0으로 DFS 탐색 시작
        dfs("", 0);
        
        // 탐색 완료 후 찾고자 하는 단어가 몇 번째 인덱스에 있는지 반환
        // 사전의 첫 번째 단어(A)의 순서가 1이므로 인덱스 값에 1을 더함
        return list.indexOf(word) + 1;
    }

    // 모든 경우의 수의 단어를 사전순으로 생성하는 재귀 함수
    private static void dfs(String str, int depth) {
        // 단어의 최대 길이는 5이므로, 5를 초과하면 재귀 종료
        if (depth > 5) {
            return;
        }
        
        // 빈 문자열이 아니라면 리스트에 추가 (사전 등록)
        if (!str.equals("")) {
            list.add(str);
        }
        
        // 모음 배열을 순회하며 다음 글자를 결합
        for (int i = 0; i < vowels.length; i++) {
            dfs(str + vowels[i], depth + 1);
        }
    }
}
