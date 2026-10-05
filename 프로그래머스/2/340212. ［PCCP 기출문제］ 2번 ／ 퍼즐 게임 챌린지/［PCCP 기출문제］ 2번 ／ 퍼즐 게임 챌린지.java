class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int low = 1;
        int high = 100000; // diffs의 최대값 범위 (보통 100,000 또는 배열 내 최대값)
        for (int d : diffs) {
            high = Math.max(high, d);
        }
        
        int answer = high;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canSolve(diffs, times, limit, mid)) {
                answer = mid;
                high = mid - 1; // 더 작은 숙련도가 가능한지 탐색
            } else {
                low = mid + 1;
            }
        }
        
        return answer;
    }
    
    private boolean canSolve(int[] diffs, int[] times, long limit, int level) {
        long totalTime = 0;
        int n = diffs.length;
        
        for (int i = 0; i < n; i++) {
            int diff = diffs[i];
            int timeCur = times[i];
            
            if (diff <= level) {
                totalTime += timeCur;
            } else {
                int retry = diff - level;
                int timePrev = (i == 0) ? 0 : times[i - 1];
                totalTime += (long) retry * (timeCur + timePrev) + timeCur;
            }
            
            if (totalTime > limit) return false;
        }
        
        return true;
    }
}
