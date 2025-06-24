class Solution {
    public int solution(int[][] dots) {
        return isParallel(dots[0], dots[1], dots[2], dots[3]) ||
               isParallel(dots[0], dots[2], dots[1], dots[3]) ||
               isParallel(dots[0], dots[3], dots[1], dots[2]) ? 1 : 0;
    }
    
    private boolean isParallel(int[] a, int[] b, int[] c, int[] d) {
        int dx1 = b[0] - a[0];
        int dy1 = b[1] - a[1];
        int dx2 = d[0] - c[0];
        int dy2 = d[1] - c[1];
        return dy1 * dx2 == dy2 * dx1;
    }
}