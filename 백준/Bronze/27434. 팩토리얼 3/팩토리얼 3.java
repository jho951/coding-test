import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N <= 1) {
            System.out.println(1);
            return;
        }

        System.out.println(factorial(1, N));
    }

    static BigInteger factorial(int start, int end) {
        if (start == end) {
            return BigInteger.valueOf(start);
        }
        
        int mid = (start + end) / 2;
        BigInteger left = factorial(start, mid);
        BigInteger right = factorial(mid + 1, end);
        
        return left.multiply(right);
    }
}