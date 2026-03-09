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
		int N = nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			map.merge(nextInt(), 1, Integer::sum);
		}
		int M = nextInt();
		for(int i = 0; i < M; i++) {
			int a = nextInt();
			if(map.containsKey(a)) {
				sb.append(map.get(a)).append(' ');
			}else{
				sb.append(0).append(' ');
			}
		}
		System.out.println(sb.toString());
	}
}