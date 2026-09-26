import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        // 시간을 분으로 변환하여 담을 리스트
        int[][] times = new int[book_time.length][2];
        for (int i = 0; i < book_time.length; i++) {
            times[i][0] = convertToMinute(book_time[i][0]);
            times[i][1] = convertToMinute(book_time[i][1]) + 10; // 청소 시간 10분 추가
        }
        
        // 입실 시간 오름차순 정렬
        Arrays.sort(times, (a, b) -> Integer.compare(a[0], b[0]));
        
        // 퇴실 시간을 관리하는 우선순위 큐 (가장 빨리 끝나는 퇴실 시간이 상단)
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int[] time : times) {
            // 큐가 비어있지 않고, 가장 빨리 끝나는 방의 퇴실 시간보다 현재 예약 입실 시간이 크거나 같다면 재사용 가능
            if (!pq.isEmpty() && pq.peek() <= time[0]) {
                pq.poll();
            }
            pq.add(time[1]);
        }
        
        return pq.size(); // 큐에 남아있는 개수가 필요한 최소 객실 수
    }
    
    private int convertToMinute(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
}
