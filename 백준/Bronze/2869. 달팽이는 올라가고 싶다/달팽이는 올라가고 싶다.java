import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}
	static int nextInt() throws IOException { return Integer.parseInt(next()); }

	public static void main(String[] args) throws Exception {
		int raise = nextInt();
		int fall = nextInt();
		int height = nextInt();
		int days = (height - fall) / (raise - fall);
		if ( (height - fall) %  (raise - fall) != 0) {
			days++;
		}

		System.out.println(days);
	}
}