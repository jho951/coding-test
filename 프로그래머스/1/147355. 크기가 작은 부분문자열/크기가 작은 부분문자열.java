class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        long pValue = Long.parseLong(p); 
        for (int i = 0; i <= t.length() - len; i++) {
            String chunk = t.substring(i, i + len);

            if (Long.parseLong(chunk) <= pValue) {
                answer++;
            }
        }
        return answer;
    }
}