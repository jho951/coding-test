class Solution {
    public int solution(int[][] triangle) {
        // 아래층에서부터 위층으로 올라가며 합을 갱신합니다.
        for (int i = triangle.length - 2; i >= 0; i--) {
            for (int j = 0; j < triangle[i].length; j++) {
                // 바로 아래와 오른쪽 아래 중 더 큰 값을 현재 값에 더합니다.
                triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
            }
        }
        
        // 꼭대기(0, 0)에 최종 최댓값이 저장되어 있습니다.
        return triangle[0][0];
    }
}
