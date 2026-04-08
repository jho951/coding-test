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
		int M = nextInt();

		if( M != 0){
			System.out.println(280);
		}else{
			if(N >= 12 && N <= 16){
				System.out.println(320);
			}else{
				System.out.println(280);
			}
		}

	}
}