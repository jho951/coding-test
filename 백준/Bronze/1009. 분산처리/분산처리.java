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
		int N = nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			int base = nextInt();
			int exp = nextInt();
			int result = 1;
			for (int j = 0; j < exp; j++) {
				result = (result * base) % 10;
			}
            if (result == 0) result = 10;
			sb.append(result).append('\n');
		}
		System.out.println(sb);
	}
}