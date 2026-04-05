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
	static double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		int count = nextInt();
		for (int i = 0; i < count; i++) {
			int n = nextInt();
			sb.append(n).append(' ').append(n).append('\n');
		}
		System.out.println(sb);

	}
}