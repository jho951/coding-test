import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        // [수정] 2차원 배열의 두 번째 원소(진출 지점)를 기준으로 오름차순 정렬 (기본 기본형 비교로 속도 최적화)
        Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));

        int answer = 0;
        int lastCamera = -30001; // 카메라 초기 위치 (문제 조건인 -30,000보다 작은 값)

        for (int[] route : routes) {
            // 현재 차량의 진입 지점이 마지막 카메라 위치보다 뒤에 있다면
            if (route[0] > lastCamera) {
                answer++;
                lastCamera = route[1]; // 현재 차량의 진출 지점에 새로운 카메라 설치
            }
        }

        return answer;
    }
}
