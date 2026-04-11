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

	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		sb.append("UOS");
		long N = (nextLong() - 1) % sb.length();
		System.out.println(sb.charAt((int)N));
	}
}
