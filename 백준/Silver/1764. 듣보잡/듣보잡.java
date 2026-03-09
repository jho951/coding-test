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

		Set<String> neverHeard = new HashSet<>();
		for (int i = 0; i < N; i++) {
			neverHeard.add(next());
		}

		List<String> result = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			String name = next();
			if (neverHeard.contains(name)) {
				result.add(name);
			}
		}

		Collections.sort(result);

		StringBuilder sb = new StringBuilder();
		sb.append(result.size()).append("\n");
		for (String name : result) {
			sb.append(name).append("\n");
		}
		System.out.print(sb);
	}
}