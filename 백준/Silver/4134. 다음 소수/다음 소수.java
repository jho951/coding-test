import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 테스트 케이스 개수
        int t = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(br.readLine());
            
            // n부터 시작해서 소수를 찾을 때까지 1씩 증가
            while (true) {
                if (isPrime(n)) {
                    System.out.println(n);
                    break;
                }
                n++;
            }
        }
    }

    // 소수 판별 함수 (제곱근 방식)
    public static boolean isPrime(long x) {
        if (x <= 1) return false;
        if (x == 2 || x == 3) return true;
        if (x % 2 == 0 || x % 3 == 0) return false;

        // 5부터 제곱근까지 검사 (효율을 위해 6k ± 1 규칙 활용 가능하나 기본 제곱근도 충분)
        for (long i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
