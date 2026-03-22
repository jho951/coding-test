import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || !st.hasMoreElements()) {
			st = new StringTokenizer(br.readLine());
		}
		return st.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}


	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append(next());
		
		String uppersb = sb.toString().toUpperCase();
		String downsb = sb.toString().toLowerCase();

		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == uppersb.charAt(i)) {
				sb.setCharAt(i, downsb.charAt(i));
			} else {
				sb.setCharAt(i, uppersb.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
}