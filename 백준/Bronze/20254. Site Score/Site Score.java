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

	public static void main(String[] args) throws Exception {
		int UR = nextInt() * 56;
		int TR = nextInt() * 24;
		int UO = nextInt() * 14;
		int TO = nextInt() * 6;
		System.out.println(UR + TR + UO + TO);
	}
}