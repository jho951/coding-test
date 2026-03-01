/**
 * 기본 템플릿
 */
import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}
	static int nextInt() throws IOException { return Integer.parseInt(next()); }

	public static void main(String[] args) throws Exception {
		int N = nextInt();
		StringBuilder sb = new StringBuilder();
		for (int d = 2; d * d <= N; d++) {
			while (N % d == 0) {
				sb.append(d).append("\n");
				N /= d;
			}
		}
		if (N > 1) {
			sb.append(N).append("\n");
		}
		System.out.println(sb);
	}
}