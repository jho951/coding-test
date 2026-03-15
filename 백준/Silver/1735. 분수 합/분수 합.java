import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    // 최대공약수를 구하는 메소드 (유클리드 호제법)
    public static int getGCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) throws Exception {
        // 첫 번째 분수: A/B
        int A = nextInt();
        int B = nextInt();
        // 두 번째 분수: C/D
        int C = nextInt();
        int D = nextInt();

        // 1. 통분하여 분자와 분모 계산
        int numerator = (A * D) + (C * B); // 분자
        int denominator = B * D;           // 분모

        // 2. 분자와 분모의 최대공약수 계산
        int gcd = getGCD(numerator, denominator);

        // 3. 최대공약수로 나누어 기약분수 만들기
        StringBuilder sb = new StringBuilder();
        sb.append(numerator / gcd).append(' ').append(denominator / gcd);
        
        System.out.println(sb);
    }
}