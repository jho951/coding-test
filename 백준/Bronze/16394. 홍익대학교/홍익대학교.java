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

	static final int YEAR = 1946;

	public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	System.out.println(N - YEAR);
	}
}