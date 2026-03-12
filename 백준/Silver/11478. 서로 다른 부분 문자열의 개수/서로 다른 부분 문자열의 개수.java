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

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append(next());
		Set<String> set = new HashSet<>();
		for(int i = 0; i< sb.length(); i++) {
			for(int j = i + 1; j<= sb.length(); j++) {
				set.add(sb.substring(i, j));
			}
		}
		System.out.println(set.size());
	}
}