class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String a = my_string.substring(0,s);
        a += overwrite_string;
        String b = my_string.substring(overwrite_string.length() + s);
    
        return a + b;
    }
}