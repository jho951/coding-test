import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        // 1. 일반 큐에 프로세스의 원래 위치(인덱스)와 우선순위를 저장합니다.
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]});
        }
        
        // 2. 우선순위 큐를 통해 가장 큰 우선순위 값을 쉽게 찾습니다. (내림차순 정렬)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int p : priorities) {
            pq.offer(p);
        }
        
        // 3. 큐가 빌 때까지 반복합니다.
        while (!queue.isEmpty()) {
            int[] current = queue.poll(); // 현재 큐에서 꺼낸 프로세스
            
            // 4. 꺼낸 프로세스의 우선순위가 현재 가장 높은 우선순위와 같다면 실행합니다.
            if (current[1] == pq.peek()) {
                pq.poll(); // 우선순위 큐에서도 제거합니다.
                answer++;  // 실행 순서를 1 증가시킵니다.
                
                // 5. 방금 실행한 프로세스가 내가 찾던(location) 위치라면 반복을 멈춥니다.
                if (current[0] == location) {
                    break;
                }
            } else {
                // 6. 우선순위가 더 높은 프로세스가 있다면, 꺼낸 프로세스를 다시 큐 뒤에 넣습니다.
                queue.offer(current);
            }
        }
        
        return answer;
    }
}
