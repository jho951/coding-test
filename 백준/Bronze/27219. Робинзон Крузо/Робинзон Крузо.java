import java.io.*;
import java.math.BigInteger;
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

	static long nextLong() throws IOException {
		return Long.parseLong(next());
	}
	static double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}

	public static void main(String[] args) throws Exception {
		int N = nextInt();
		StringBuilder sb = new StringBuilder();

		// 5일 묶음만큼 'V'를 추가
		for (int i = 0; i < N / 5; i++) {
			sb.append("V");
		}

		// 남은 일수만큼 'I'를 추가
		for (int i = 0; i < N % 5; i++) {
			sb.append("I");
		}

		System.out.println(sb);
	}
}