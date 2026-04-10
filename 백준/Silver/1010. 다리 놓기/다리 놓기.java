import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            String line = br.readLine();
            if (line == null) return null;
            st = new StringTokenizer(line);
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        String s = next();
        if (s == null) return -1;
        return Integer.parseInt(s);
    }

    static int[][] memo = new int[31][31];

    static int combinationDP(int n, int r) {
        if (n == r || r == 0) return 1;
        if (memo[n][r] > 0) return memo[n][r];
        return memo[n][r] = combinationDP(n - 1, r - 1) + combinationDP(n - 1, r);
    }

    public static void main(String[] args) throws Exception {
        String tStr = next();
        if (tStr == null) return;
        int testCases = Integer.parseInt(tStr);

        for (int i = 0; i < testCases; i++) {
            int n = nextInt();
            int m = nextInt();
            System.out.println(combinationDP(m, n));
        }
    }
}
