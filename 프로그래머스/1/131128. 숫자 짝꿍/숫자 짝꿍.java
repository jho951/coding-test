import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        // 1. 각 숫자의 빈도수를 저장할 배열 (0~9까지 10칸)
        int[] countX = new int[10];
        int[] countY = new int[10];
        
        // 2. X의 숫자 개수 세기
        for (char c : X.toCharArray()) {
            countX[c - '0']++;
        }
        
        // 3. Y의 숫자 개수 세기
        for (char c : Y.toCharArray()) {
            countY[c - '0']++;
        }
        
        // 4. 결과를 담을 StringBuilder (String 연산보다 훨씬 빠름)
        StringBuilder sb = new StringBuilder();
        
        // 5. 9부터 0까지 큰 숫자 순서대로 확인
        for (int i = 9; i >= 0; i--) {
            int commonCount = Math.min(countX[i], countY[i]);
            for (int j = 0; j < commonCount; j++) {
                sb.append(i);
            }
        }
        
        // 6. 예외 처리 및 결과 반환
        String result = sb.toString();
        
        if (result.isEmpty()) return "-1";      // 짝꿍이 없는 경우
        if (result.startsWith("0")) return "0";  // 0으로만 이루어진 경우 (예: "000")
        
        return result;
    }
}