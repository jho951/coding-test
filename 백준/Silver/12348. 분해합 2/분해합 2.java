import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		String line = br.readLine();
		if (line == null) return null;
		st = new StringTokenizer(line);
		return st.nextToken();
	}
	
	public static void main(String[] args) throws Exception {
		String sN = next();
		if (sN == null) return;

		long N = Long.parseLong(sN);
		int d = sN.length();

		long start = Math.max(1L, N - 9L * d);
		long answer = 0;

		for (long i = start; i < N; i++) {
			if (N == i + getSum(i)) {
				answer = i;
				break;
			}
		}
		System.out.println(answer);
	}

	static long getSum(long n) {
		long sum = 0;
		while (n > 0) {
			sum += (n % 10);
			n /= 10;
		}
		return sum;
	}
}