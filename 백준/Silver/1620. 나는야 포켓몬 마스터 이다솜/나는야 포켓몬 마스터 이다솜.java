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
		StringBuilder sb = new StringBuilder();
		
		Map<Integer, String> numToName = new HashMap<>(N + 1);
		Map<String, Integer> nameToNum = new HashMap<>(N + 1);

		for (int i = 1; i <= N; i++) {
			String name = next();
			numToName.put(i, name); 
			nameToNum.put(name, i);
		}

		for (int j = 0; j < M; j++) {
			String str = next();
			if (Character.isDigit(str.charAt(0))) {
				int num = Integer.parseInt(str);
				sb.append(numToName.get(num)).append("\n");
			} else {
				sb.append(nameToNum.get(str)).append("\n");
			}
		}
		System.out.print(sb);
	}
}
