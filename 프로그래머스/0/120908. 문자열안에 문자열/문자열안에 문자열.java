class Solution {
    public int solution(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        // str1에서 str2가 시작할 수 있는 모든 위치를 순회
        for (int i = 0; i <= len1 - len2; i++) {
            boolean match = true;
            for (int j = 0; j < len2; j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) return 1;  // str2가 str1 안에 있음
        }

        return 2;  // 포함되지 않음
    }
}
