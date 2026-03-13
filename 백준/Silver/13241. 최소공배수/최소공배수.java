import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            String line = br.readLine();
            if (line == null) return null;
            st = new StringTokenizer(line);
        }
        return st.nextToken();
    }
    
    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static long getGcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    static long Lcm(long a, long b) {
        return (a / getGcd(a, b)) * b;
    }

    public static void main(String[] args) throws Exception {
        long A = nextLong();
        long B = nextLong();
        System.out.print(Lcm(A, B));
    }
}