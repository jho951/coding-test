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
		int prize =  nextInt();
		StringBuilder sb = new StringBuilder();
		int A = prize - (int)(prize * 0.22);
		int B = (int)(prize * 0.8);
		int C = (prize - B);
		int D = C - (int)(C * 0.22);
		sb.append(A).append(" ").append(B+D);
		System.out.println(sb);
	}
}