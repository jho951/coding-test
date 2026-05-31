import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int time = 0;
        int current_weight = 0; // 현재 다리 위 트럭들의 총 무게
        int truck_index = 0;    // 대기 중인 트럭의 인덱스

        // 1. 다리 길이만큼 0으로 채워 초기화
        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }

        // 2. 모든 트럭이 다리에 진입할 때까지 반복
        while (truck_index < truck_weights.length) {
            time++; // 1초 경과
            
            // 다리 맨 앞의 트럭(또는 0)을 탈출시킴
            current_weight -= bridge.poll();

            // 다음 대기 트럭이 다리에 올라올 수 있는지 확인
            int next_truck = truck_weights[truck_index];
            if (current_weight + next_truck <= weight) {
                bridge.offer(next_truck);
                current_weight += next_truck;
                truck_index++; // 다음 트럭으로 이동
            } else {
                // 무게 초과 시 트럭 대신 0을 넣어 기존 트럭을 앞으로 전진시킴
                bridge.offer(0);
            }
        }

        // 3. 마지막 트럭이 다리에 올라간 후 완전히 건너기까지 걸리는 시간(다리 길이) 추가
        return time + bridge_length;
    }
}
