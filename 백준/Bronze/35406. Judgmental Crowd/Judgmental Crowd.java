import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        if (s == null) return;

        int score = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            // 1. "bravo" 체크 (+3점)
            if (i + 5 <= n && s.startsWith("bravo", i)) {
                score += 3;
            }
            
            // 2. "ha" 체크 (+1점)
            if (i + 2 <= n && s.startsWith("ha", i)) {
                score += 1;
            }
            
            // 3. "boooo" 체크 (-1점)
            // 주의: b 다음에 o가 4개인 "boooo" 문자열을 찾습니다.
            if (i + 5 <= n && s.startsWith("boooo", i)) {
                score -= 1;
            }
        }

        System.out.println(score);
    }
}