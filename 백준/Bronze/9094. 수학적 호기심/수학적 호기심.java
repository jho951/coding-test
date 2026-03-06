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
		int T = nextInt();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < T; i++) {
			int n = nextInt();
			int m = nextInt();
			int answer = 0;

			for (int a = 1; a < n; a++) {
				for (int b = a + 1; b < n; b++) {
					if ((a * a + b * b + m) % (a * b) == 0) {
						answer++;
					}
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}