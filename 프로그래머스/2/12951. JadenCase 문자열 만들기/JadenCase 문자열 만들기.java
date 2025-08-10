class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isFirstLetter = true;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(' ');
                isFirstLetter = true;
            } else {
                if (isFirstLetter) {
                    sb.append(Character.toUpperCase(c));
                    isFirstLetter = false;
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }
        }
        return sb.toString();
    }
}