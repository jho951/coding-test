import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || !st.hasMoreElements()) {
			String line = br.readLine();
			if (line == null) return null;
			st = new StringTokenizer(line);
		}
		return st.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public static void main(String[] args) throws Exception {
		int N = nextInt();
		int M = nextInt();
		
		BigInteger A = new BigInteger(next());
		BigInteger B = new BigInteger(next());
		
		System.out.println(A.multiply(B));
	}
}
