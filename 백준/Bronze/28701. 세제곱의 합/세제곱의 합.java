import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || !st.hasMoreElements()) {
			String line = br.readLine();
			st = new StringTokenizer(line);
		}
		return st.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}
	static float nextFloat() throws IOException {
		return Float.parseFloat(next());
	}

	public static void main(String[] args) throws Exception {
		int N = nextInt();
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		for(int i = 1; i <= N; i++) {
			result1 += i;
			result2 += i;
			result3 += (int)Math.pow(i, 3);
		}
		System.out.println(result1);
		System.out.println(result2 * result2);
		System.out.println(result3);
	}
}
