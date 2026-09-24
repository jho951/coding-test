import java.util.*;

class Solution {
    public int[] solution(int n) {
        // 직각삼각형 형태를 저장할 2차원 배열
        int[][] matrix = new int[n][n];
        
        // 전체 숫자의 개수 (1부터 n까지의 합)
        int maxNum = n * (n + 1) / 2;
        int[] answer = new int[maxNum];
        
        int x = -1, y = 0; // 시작 위치 (첫 번째 이동 시 아래로 가므로 x를 -1로 시작)
        int num = 1;       // 채워넣을 숫자
        
        // i는 각 단계에서 이동할 칸의 수 (n개 -> n-1개 -> n-2개 ... -> 1개)
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i % 3 == 0) {
                    // 1. 아래로 이동
                    x++;
                } else if (i % 3 == 1) {
                    // 2. 오른쪽으로 이동
                    y++;
                } else if (i % 3 == 2) {
                    // 3. 대각선 위로 이동
                    x--;
                    y--;
                }
                matrix[x][y] = num++;
            }
        }
        
        // 2차원 배열에 채워진 숫자들을 1차원 배열로 순서대로 옮기기
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                answer[index++] = matrix[i][j];
            }
        }
        
        return answer;
    }
}
