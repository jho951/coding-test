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
		int N = nextInt();
		int K = nextInt(); 
		int count = 0;
		
		for (int h = 0; h <= N; h++) {
			for (int m = 0; m < 60; m++) {
				for (int s = 0; s < 60; s++) {
					String time = String.format("%02d%02d%02d", h, m, s);
					if (time.contains(String.valueOf(K))) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}