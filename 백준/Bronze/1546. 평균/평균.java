import java.util.*;
import java.io.*;


public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}
	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}
	public static void main(String[] args) throws IOException {
		int N = nextInt();
		int[] scores = new int[N];
		long result = 0;
		for (int i = 0; i < N; i++) {
			scores[i] = nextInt();
			result += scores[i];
		}
		int max = Arrays.stream(scores).max().getAsInt();


		System.out.println((result * 100.0) / max / N);
	}
}
