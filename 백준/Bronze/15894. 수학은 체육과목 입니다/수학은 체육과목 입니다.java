import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static long nextLong() throws IOException {
		return Long.parseLong(next());
	}
	public static void main(String[] args) throws IOException {
		long N = nextLong();
		System.out.println(N * 4);
	}
}
