class Solution {
    int[] MONTH = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String[] DAY = new String[]{"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

    public String solution(int a, int b) {
        int count = 0;
        for (int i = 1; i < a; i++) {
            count += MONTH[i - 1];
        };
        count += b; 
        return count % 7 < 0? DAY[DAY.length + (count % 7)] : DAY[count % 7];
    }
}