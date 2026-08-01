import java.util.*;

class Solution {
    public int[] solution(int m, int n, int h, int w, int[][] drops) {
        int[][] grid = new int[m][n];
        for (int r = 0; r < m; r++) Arrays.fill(grid[r], Integer.MAX_VALUE);
        for (int i = 0; i < drops.length; i++) grid[drops[i][0]][drops[i][1]] = i + 1;
        
        // 가로 방향(w) 단조 큐 슬라이딩 윈도우
        int[][] rowMin = new int[m][n - w + 1];
        for (int r = 0; r < m; r++) {
            Deque<Integer> dq = new ArrayDeque<>();
            for (int c = 0; c < n; c++) {
                if (!dq.isEmpty() && dq.peekFirst() < c - w + 1) dq.pollFirst();
                while (!dq.isEmpty() && grid[r][dq.peekLast()] >= grid[r][c]) dq.pollLast();
                dq.offerLast(c);
                if (c >= w - 1) rowMin[r][c - w + 1] = grid[r][dq.peekFirst()];
            }
        }
        
        // 세로 방향(h) 단조 큐 슬라이딩 윈도우 및 최적 위치 찾기
        int maxTime = -1, ansR = 0, ansC = 0;
        for (int c = 0; c < n - w + 1; c++) {
            Deque<Integer> dq = new ArrayDeque<>();
            for (int r = 0; r < m; r++) {
                if (!dq.isEmpty() && dq.peekFirst() < r - h + 1) dq.pollFirst();
                while (!dq.isEmpty() && rowMin[dq.peekLast()][c] >= rowMin[r][c]) dq.pollLast();
                dq.offerLast(r);
                if (r >= h - 1) {
                    int time = rowMin[dq.peekFirst()][c];
                    if (time > maxTime) {
                        maxTime = time; ansR = r - h + 1; ansC = c;
                    }
                }
            }
        }
        return new int[]{ansR, ansC};
    }
}
