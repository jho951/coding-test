import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer tokenizer;
	static String next() throws IOException {
			while (tokenizer == null || !tokenizer.hasMoreTokens())
				tokenizer = new StringTokenizer(reader.readLine());
			return tokenizer.nextToken();
	}
	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public static void main(String[] args) throws IOException {
		int a1 = nextInt(); // N
		int a0 = nextInt(); // M
		int c = nextInt();  // C
		int n0 = nextInt(); // co
		if((a1 * n0 + a0 <= c * n0) && (a1 <= c)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
