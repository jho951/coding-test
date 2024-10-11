import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] result = new String[my_string.length()];

        // 한 글자씩 앞에서 제거된 문자열을 배열에 담기
        for (int i = 0; i < my_string.length(); i++) {
            result[i] = my_string.substring(i);
        }
        Arrays.sort(result);
        return result;
    }
}