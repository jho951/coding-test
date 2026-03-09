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
		
		int[] origin = new int[N];
		int[] sorted = new int[N];

		StringBuilder sb = new StringBuilder();
		Map<Integer, Integer> rankMap = new HashMap<>();

		for (int i = 0; i < N; i++) {origin[i] = sorted[i] = nextInt();}

		Arrays.sort(sorted);

		int rank = 0;
		for (int value : sorted) {
			if (!rankMap.containsKey(value)) {
				rankMap.put(value, rank);
				rank++;
			}
		}
		
		for (int value : origin) {
			sb.append(rankMap.get(value)).append(" ");
		}

		System.out.println(sb);
	}
}