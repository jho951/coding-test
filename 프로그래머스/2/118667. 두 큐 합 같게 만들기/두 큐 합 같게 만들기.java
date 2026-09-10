import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        long sum1 = 0;
        long sum2 = 0;
        
        // 큐 초기화 및 각 큐의 원소 합 계산
        for (int num : queue1) {
            q1.add(num);
            sum1 += num;
        }
        for (int num : queue2) {
            q2.add(num);
            sum2 += num;
        }
        
        // 두 큐의 총합이 홀수라면 절대로 반으로 나눌 수 없음
        if ((sum1 + sum2) % 2 != 0) {
            return -1;
        }
        
        int answer = 0;
        // 최대 반복 횟수 제한: 두 큐의 원소가 원래 자리로 돌아오거나 교차하는 한계치 (원래 길이 * 3)
        int maxOperations = queue1.length * 3;
        
        while (sum1 != sum2) {
            // 최대 작업 횟수를 초과하면 두 큐의 합을 같게 만들 수 없는 상태임
            if (answer > maxOperations) {
                return -1;
            }
            
            // 합이 더 큰 큐에서 빼서 작은 큐로 이동
            if (sum1 > sum2) {
                int val = q1.poll();
                sum1 -= val;
                sum2 += val;
                q2.add(val);
            } else {
                int val = q2.poll();
                sum2 -= val;
                sum1 += val;
                q1.add(val);
            }
            answer++;
        }
        
        return answer;
    }
}
