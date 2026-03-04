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
	public static void main(String[] args) throws Exception {
		String N = next();
		String[] str = N.split("");
		StringBuilder sb = new StringBuilder();
		Arrays.sort(str,Collections.reverseOrder());
		for (String num : str) {
			sb.append(num);
		}
		System.out.println(sb);
	}
}