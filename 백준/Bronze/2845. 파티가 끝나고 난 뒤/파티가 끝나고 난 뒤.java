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

	public static void main(String[] args) throws Exception {
		int N = nextInt() * nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 5; i++) {
			int M = nextInt();
			sb.append(M - N).append(" ");
		}
		System.out.println(sb);
	}
}