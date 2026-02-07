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
		int[] A = new int[N];
		int[] ans = new int[N];
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < N; i++) {
			A[i] = nextInt();
		}

		for (int i = 0; i < N; i++) {
			while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
				ans[stack.pop()] = A[i];
			}
			stack.push(i);
		}

		while (!stack.isEmpty()) {
			ans[stack.pop()] = -1;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(ans[i]).append(" ");
		}
		System.out.println(sb.toString());
	}
}