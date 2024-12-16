import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> answer = new ArrayList<>(); // 정수 리스트로 수정
        for (int i = 1; i <= n/k; i++) { // 1부터 n까지 확인
            if (k * i <= n) {
                answer.add(k*i); // i가 k의 약수이면 리스트에 추가
            }
        }
        
        // List를 int[]로 변환
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}
