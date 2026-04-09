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
	static float nextFloat() throws IOException {
		return Float.parseFloat(next());
	}

	public static void main(String[] args) throws Exception {
		int A = nextInt();
		int B = nextInt();
		System.out.println(Math.min(A, B));
	}
}
