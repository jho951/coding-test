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

		while (T-- > 0) {
				int x1 = nextInt();
				int y1 = nextInt();
				int r1 = nextInt();
				int x2 = nextInt();
				int y2 = nextInt();
				int r2 = nextInt();

				int distSq = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

				if (x1 == x2 && y1 == y2 && r1 == r2) {
					System.out.println(-1);
				}else if (distSq > Math.pow(r1 + r2, 2) || distSq < Math.pow(r1 - r2, 2)) {
					System.out.println(0);
				}else if (distSq == Math.pow(r1 + r2, 2) || distSq == Math.pow(r1 - r2, 2)) {
					System.out.println(1);
				}else {
					System.out.println(2);
				}
		}
	}
}
