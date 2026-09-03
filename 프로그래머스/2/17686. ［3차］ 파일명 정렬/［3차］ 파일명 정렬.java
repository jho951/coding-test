import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String head1 = getHead(s1);
                String head2 = getHead(s2);
                
                // 1. HEAD 기준 사전 순 정렬 (대소문자 구분 없음)
                int result = head1.toLowerCase().compareTo(head2.toLowerCase());
                if (result != 0) {
                    return result;
                }
                
                // 2. HEAD가 같다면 NUMBER 숫자 순 정렬
                int num1 = getNumber(s1, head1.length());
                int num2 = getNumber(s2, head2.length());
                
                return Integer.compare(num1, num2);
            }
        });
        
        return files;
    }
    
    // HEAD 부분을 추출하는 메서드
    private String getHead(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                break;
            }
            sb.append(c);
        }
        return sb.toString();
    }
    
    // NUMBER 부분을 숫자로 추출하는 메서드
    private int getNumber(String s, int headLen) {
        StringBuilder sb = new StringBuilder();
        for (int i = headLen; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c) || sb.length() >= 5) {
                break;
            }
            sb.append(c);
        }
        return Integer.parseInt(sb.toString());
    }
}