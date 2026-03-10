/**
 * 기본 템플릿
 * 1005번 문제
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
		int M = nextInt();
		int[] arr = new int[N];
		int[] answer = new int[N + 1];
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i < N; i++) {
			arr[i] = nextInt();
			answer[i + 1] = answer[i] + arr[i];
		}
		for(int i = 0; i < M; i++){
			int start = nextInt() - 1;
			int end = nextInt();
			sb.append( answer[end] - answer[start]).append('\n');
		}
		System.out.println(sb.toString());
	}
}