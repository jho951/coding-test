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
		int d = digits(N);
		int start = Math.max(1, N - 9 * d);
		int answer = 0;
		for (int x = start; x <= N; x++) {
			int value = x + digitSum(x);
			if (value == N) {
				answer = x;
				break;
			}
		}System.out.println(answer);
	}
	static int digitSum(int x) {
		int sum = 0;
		while (x > 0) {
			sum += (x % 10);
			x /= 10;
		}
		return sum;
	}
	static int digits(int n) {
		return String.valueOf(n).length();
	}
}