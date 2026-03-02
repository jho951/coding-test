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
		int a = nextInt(), b = nextInt(), c = nextInt();
		int d = nextInt(), e = nextInt(), f = nextInt();
		int denominator = a * e - b * d;
		int x = (c * e - b * f) / denominator;
		int y = (a * f - c * d) / denominator;
		System.out.println(x);
		System.out.println(y);
	}
}