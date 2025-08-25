class Solution {
    public int solution(String[][] board, int h, int w) {
        int n = board.length;
        int m = board[0].length;
        String target = board[h][w];
        
        int[] dh = {-1, 1, 0, 0};
        int[] dw = {0, 0, -1, 1};
        
       int count = 0;
        for (int i = 0; i < 4; i++) {
            int nh = h + dh[i];
            int nw = w + dw[i];
            // 경계 체크
            if (0 <= nh && nh < n && 0 <= nw && nw < m) {
                if (target.equals(board[nh][nw])) {
                    count++;            // 같은 칸마다 +1
                }
            }
        }
        return count;
    }
}