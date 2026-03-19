import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || !st.hasMoreElements()) {
			st = new StringTokenizer(br.readLine());
		}
		return st.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}
	static int getGcd(int a, int b) {
		while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}


	public static void main(String[] args) throws Exception {
		int N = nextInt();
		int [] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = nextInt();
		}
		int gcd = 0;
		for (int i = 0; i < N - 1; i++) {
			int diff = arr[i + 1] - arr[i];
			if (i == 0) {
				gcd = diff;
			} else {
				gcd = getGcd(gcd, diff);
			}
		}

		int totalDistance = arr[N - 1] - arr[0];
		int totalTrees = (totalDistance / gcd) + 1;

		System.out.println(totalTrees - N);
	}
}