import java.io.*;
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
	static long nextLong() throws IOException {
		return Long.parseLong(next());
	}
	static int zero = 0;
	static int one = 1;

	static int fibonacci(int n) {
		if (n == 0) {
			zero++;
			return 0;
		} else if (n == 1) {
			one++;
			return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	static char[] text ="WelcomeToSMUPC".toCharArray();

	public static void main(String[] args) throws IOException {
		int T = (nextInt() - 1) % text.length;
		System.out.print(text[T]);
	}
}