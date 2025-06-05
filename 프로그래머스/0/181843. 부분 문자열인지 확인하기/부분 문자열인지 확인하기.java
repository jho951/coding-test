class Solution {
    public int solution(String my_string, String target) {
        int len1 = my_string.length();
        int len2 = target.length();
        for(int i = 0; i<= len1 - len2; i++){
            boolean match = true;
            for(int j = 0; j< len2; j++){
                if (my_string.charAt(i + j) != target.charAt(j)) {
                    match = false;
                    break;
                }
            }
             if (match) return 1;
        }
        return 0;
    }
}