import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    // 읽을 데이터가 없으면 null을 반환하도록 수정
    static String next() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            String line = br.readLine();
            if (line == null) return null; // 파일 끝(EOF) 처리
            st = new StringTokenizer(line);
        }
        return st.nextToken();
    }

    public static void main(String[] args) throws Exception {
        while (true) {
            String A = next();
            if (A == null) break; // 첫 번째 숫자(N)가 없으면 종료
            
            String B = next();
            if (B == null) break; // 두 번째 숫자(S)가 없으면 종료

            // 문제 조건: S는 10^9까지이므로 int로 충분하지만, 
            // 결과값 계산 시 N+1이 10001이 될 수 있으므로 자료형 주의
            long n = Long.parseLong(A);
            long s = Long.parseLong(B);
            
            // x = S / (N + 1)
            System.out.println(s / (n + 1));
        }
    }
}
