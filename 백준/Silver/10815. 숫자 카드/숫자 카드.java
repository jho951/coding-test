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
		StringBuilder sb = new StringBuilder();
		Set<Integer> set = new HashSet<>();
		int N = nextInt();
		for (int i = 0; i < N; i++) { set.add(nextInt());}
		int M = nextInt();
		while (M-- > 0) {
			if(set.contains(nextInt())) sb.append(1).append(" ");
			else sb.append(0).append(" ");
		}
		System.out.println(sb);
	}
}