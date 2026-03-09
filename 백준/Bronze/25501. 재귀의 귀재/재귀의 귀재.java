/**
 * 기본 템플릿
 * 1005번 문제
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
	static int count;

	static int recursion(String str, int l, int r) {
		count++;
		if (l >= r) return 1;
		else if (str.charAt(l) != str.charAt(r)) return 0;
		else return recursion(str, l + 1, r - 1);
	}

	static int isPalindrome(String str) {
		count = 0;
		return recursion(str, 0, str.length() - 1);
	}

	public static void main(String[] args) throws Exception {
		int N = nextInt();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			String str = next();
			int result = isPalindrome(str);
			sb.append(result).append(" ").append(count).append("\n");
		}
		System.out.print(sb);
	}

}