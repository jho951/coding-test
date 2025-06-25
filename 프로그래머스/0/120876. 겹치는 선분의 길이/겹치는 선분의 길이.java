class Solution {
    public int solution(int[][] lines) {
        int[] a = new int[201];
        
        for (int i = 0; i < lines.length; i++) {
            int start = lines[i][0];
            int end = lines[i][1];
            
            for (int j = Math.min(start, end); j < Math.max(start, end); j++) {
                a[j + 100] += 1;
            }
        }

        int answer = 0;
        for (int count : a) {
            if (count >= 2) answer++;
        }

        return answer;
    }
}
