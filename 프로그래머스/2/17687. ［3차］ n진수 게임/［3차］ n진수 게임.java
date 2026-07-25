class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder allChars = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        
        int num = 0;
        // 필요한 전체 문자열 길이(t * m)만큼 n진법 변환 결과를 이어붙임
        while (allChars.length() < t * m) {
            allChars.append(Integer.toString(num, n).toUpperCase());
            num++;
        }
        
        // 튜브가 말해야 하는 순서의 문자만 추출
        for (int i = 0; i < t; i++) {
            answer.append(allChars.charAt(i * m + (p - 1)));
        }
        
        return answer.toString();
    }
}
