import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        // 1. 철수(왼쪽)와 동생(오른쪽)의 토핑 종류와 개수를 담을 Map 생성
        Map<Integer, Integer> leftCake = new HashMap<>();
        Map<Integer, Integer> rightCake = new HashMap<>();
        
        // 2. 처음에 동생(오른쪽)이 롤케이크를 통째로 다 가지고 있다고 가정하고 셋팅
        for (int t : topping) {
            rightCake.put(t, rightCake.getOrDefault(t, 0) + 1);
        }
        
        // 3. 롤케이크를 왼쪽부터 한 조각씩 잘라 철수(왼쪽)에게 넘기며 비교
        for (int t : topping) {
            // 철수에게 토핑 추가
            leftCake.put(t, leftCake.getOrDefault(t, 0) + 1);
            
            // 동생에게서 토핑 차감
            rightCake.put(t, rightCake.get(t) - 1);
            
            // 동생의 특정 토핑 개수가 0개가 되면 종류(Key) 자체를 삭제
            if (rightCake.get(t) == 0) {
                rightCake.remove(t);
            }
            
            // 4. 철수와 동생의 고유 토핑 종류 수가 같다면 정답 카운트 증가
            if (leftCake.size() == rightCake.size()) {
                answer++;
            }
        }
        
        return answer;
    }
}
