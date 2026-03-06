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
		String[] str = new String[N];
		for( int i = 0; i< str.length; i++ ) {str[i] = next();}
		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) return s1.compareTo(s2);
				return s1.length() - s2.length();
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		if (N > 0) {
			sb.append(str[0]).append('\n');
		}

		for (int i = 1; i < N; i++) {
			if (!str[i].equals(str[i - 1])) {
				sb.append(str[i]).append('\n');
			}
		}

		System.out.print(sb);
	}
}