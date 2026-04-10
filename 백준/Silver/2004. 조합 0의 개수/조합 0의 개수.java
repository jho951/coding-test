import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        long count5 = getCount(n, 5) - getCount(m, 5) - getCount(n - m, 5);
        long count2 = getCount(n, 2) - getCount(m, 2) - getCount(n - m, 2);
        System.out.println(Math.min(count5, count2));
    }

    static long getCount(long n, int p) {
        long count = 0;
        while (n >= p) {
            count += n / p;
            n /= p;
        }
        return count;
    }
}