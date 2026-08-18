import java.util.*;

class Solution {
    public int[] solution(String msg) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<String, Integer> dictionary = new HashMap<>();
        
        // 1. A~Z 기본 사전 초기화
        int idx = 1;
        for (char i = 'A'; i <= 'Z'; i++) {
            dictionary.put(String.valueOf(i), idx++);
        }
        
        int length = msg.length();
        for (int i = 0; i < length; i++) {
            String w = String.valueOf(msg.charAt(i));
            int nextIdx = i + 1;
            
            // 2. 사전에서 현재 입력과 일치하는 가장 긴 문자열 w 찾기
            while (nextIdx < length) {
                String nextW = w + msg.charAt(nextIdx);
                if (dictionary.containsKey(nextW)) {
                    w = nextW;
                    nextIdx++;
                } else {
                    break;
                }
            }
            
            // 3. w에 해당하는 색인 번호 출력(저장)
            result.add(dictionary.get(w));
            
            // 4. 입력에서 w를 처리했으므로 i 포인터 이동
            i += w.length() - 1;
            
            // 5. w + c(다음 글자)를 사전에 등록
            if (nextIdx < length) {
                dictionary.put(w + msg.charAt(nextIdx), idx++);
            }
        }
        
        // ArrayList를 int[]로 변환
        return result.stream().mapToInt(i -> i).toArray();
    }
}
