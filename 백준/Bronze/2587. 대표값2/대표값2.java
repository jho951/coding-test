/**
 * 기본 템플릿
 */
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
		ArrayList<Integer> list = new ArrayList<>();

		for (int t = 1; t <= 5; t++) {
			list.add(nextInt());
		}
		int sum = list.stream()
			.mapToInt(Integer::intValue)
			.sum();
		list.sort(Collections.reverseOrder());
		Collections.sort(list);
		System.out.println(sum / 5);
		System.out.println(list.get(2));
	}
}