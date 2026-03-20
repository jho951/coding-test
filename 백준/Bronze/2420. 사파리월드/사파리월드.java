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

	static long nextLong() throws IOException {
		return Long.parseLong(next());
	}


	public static void main(String[] args) throws Exception {
		long A = nextLong();
		long B = nextLong();
		System.out.println(Math.abs(A - B));
	}
}