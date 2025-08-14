import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        // 결과를 담을 리스트 생성
        List<String> list = new ArrayList<>();
        
        // i를 n씩 증가시키면서 문자열을 잘라서 추가
        for (int i = 0; i < my_str.length(); i += n) {
            // substring의 끝 인덱스는 문자열 길이를 넘지 않도록 Math.min 사용
            int end = Math.min(i + n, my_str.length());
            list.add(my_str.substring(i, end));
        }
        
        // 리스트를 배열로 변환 후 반환
        return list.toArray(new String[0]);
    }
}
