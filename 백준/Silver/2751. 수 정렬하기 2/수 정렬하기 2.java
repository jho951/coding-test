import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			String line = br.readLine();
			if (line == null) return null;
			st = new StringTokenizer(line);
		}
		return st.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public static void main(String[] args) throws Exception {
		int N = nextInt();
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			list.add(nextInt());
		}

		// 1. 최악의 경우에도 O(N log N)을 보장하는 정렬
		Collections.sort(list);

		// 2. 출력을 위해 StringBuilder 사용 (매우 중요!)
		StringBuilder sb = new StringBuilder();
		for (int value : list) {
			sb.append(value).append('\n');
		}

		// 3. 한 번에 출력
		System.out.print(sb);
	}
}