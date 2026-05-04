class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 1. 결과 행렬의 크기 결정: (arr1의 행 개수) x (arr2의 열 개수)
        int row = arr1.length;
        int col = arr2[0].length;
        int common = arr1[0].length; // 또는 arr2.length
        
        int[][] answer = new int[row][col];

        // 2. 3중 for문을 이용한 곱셈 연산
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < common; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        
        return answer;
    }
}
