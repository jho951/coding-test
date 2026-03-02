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
		int M = nextInt();
		String[][] dp = new String[N][M];

		for (int i = 0; i < N; i++) {
			String rowStr = next();
			for (int j = 0; j < M; j++) {
				dp[i][j] = String.valueOf(rowStr.charAt(j));
			}
		}

		int minAnswer = 64;

		for (int i = 0; i <= N - 8; i++) {
			for (int j = 0; j <= M - 8; j++) {
				int count = 0;
				for (int x = 0; x < 8; x++) {
					for (int y = 0; y < 8; y++) {
						String current = dp[i + x][j + y];

						if ((x + y) % 2 == 0) {
							if (!current.equals("W")) count++;
						} else {
							if (!current.equals("B")) count++;
						}
					}
				}

				int realCount = Math.min(count, 64 - count);
				if (realCount < minAnswer) {
					minAnswer = realCount;
				}
			}
		}
		System.out.println(minAnswer);
	}
}