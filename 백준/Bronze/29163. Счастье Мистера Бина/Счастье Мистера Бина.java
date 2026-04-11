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
	static long nextLong() throws IOException {
		return Long.parseLong(next());
	}
	public static void main(String[] args) throws IOException {
		int T = nextInt();
		int happy = 0;
		int sad = 0;
		for (int i = 0; i < T; i++) {
			int n = nextInt();
			if (n % 2 == 0) {
				happy++;
			} else {
				sad++;
			}
		}
		if (happy > sad) {
			System.out.println("Happy");
		} else {
			System.out.println("Sad");
		}
	}
}
