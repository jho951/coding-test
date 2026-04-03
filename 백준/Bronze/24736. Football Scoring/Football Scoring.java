import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || !st.hasMoreElements()) {
			String line = br.readLine();
			st = new StringTokenizer(line);
		}
		return st.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 2; i++) {
			int score = 0;
			score += nextInt() * 6; // Touchdown
			score += nextInt() * 3; // Field Goal
			score += nextInt() * 2; // Safety
			score += nextInt() * 1; // Point-after
			score += nextInt() * 2; // Two-point Conversion

			sb.append(score).append(" ");
		}
		System.out.println(sb.toString().trim());
	}
}