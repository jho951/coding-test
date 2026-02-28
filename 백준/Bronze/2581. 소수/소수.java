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

		List<Integer> list = new ArrayList<>();
		int sum = 0;

		for (int i = N; i <= M; i++) {
			if (isPrime(i)) {
				list.add(i);
				sum += i;
			}
		}

		if (list.isEmpty()) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(list.get(0));
		}
	}

	static boolean isPrime(int n) {
		if (n < 2) return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		}
		return true;
	}
}