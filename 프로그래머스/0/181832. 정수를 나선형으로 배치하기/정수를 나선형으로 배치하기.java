public class Solution {
    public int[][] solution(int n) {
        // 숫자를 채워넣을 n x n 크기의 빈 격자판
        int[][] matrix = new int[n][n];

        // 방향 설정: 우 -> 하 -> 좌 -> 상
        int[] dr = {0, 1, 0, -1}; // 행의 변화량
        int[] dc = {1, 0, -1, 0}; // 열의 변화량

        int r = 0; // 현재 열
        int c = 0; // 현재 행
        int dir = 0; // 현재 방향 인덱스 우측부터

        for (int i = 1; i <= n * n; i++) {
            matrix[r][c] = i;

            // 다음 갈 곳 미리 계산
            int nr = r + dr[dir]; // 열 + 행[방향 인덱스]
            int nc = c + dc[dir]; // 행 + 열[방향 인덱스]

            // 벽에 부딪히거나 이미 숫자가 채워진 경우 방향 전환
            if (nr < 0 || nr >= n || nc < 0 || nc >= n || matrix[nr][nc] != 0) {
                dir = (dir + 1) % 4; 
                nr = r + dr[dir];
                nc = c + dc[dir];
            }

            r = nr;
            c = nc;
        }

        return matrix;
    }
}