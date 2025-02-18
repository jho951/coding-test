class Solution {
    public int solution(String my_string) {
        String[] wordSplit = my_string.split("");
        int answer = 0;
        
        for (int i = 0; i < wordSplit.length; i++) {
            char ch = wordSplit[i].charAt(0);
            if (Character.isDigit(ch)) {
                answer += Character.getNumericValue(ch);
            }
        }
        return answer;
    }
}
