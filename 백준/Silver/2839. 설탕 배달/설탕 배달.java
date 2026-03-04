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
	static int A = 5;
	static int B = 3;

	public static void main(String[] args) throws Exception {
		int N = nextInt();
		int answer = 0;
		while (true) {
			if (N % A == 0) {
				answer += N / A;
				System.out.println(answer);
				return;
			}
			N -= B;
			answer++;

			if (N < 0) {
				System.out.println(-1);
				return;
			}
		}
	}
}