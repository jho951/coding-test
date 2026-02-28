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
		int answer = 0;
		int N = nextInt();
		for(int i = 0; i < N; i++){
			if(isPrime(nextInt())){
				answer++;
			}
		}
		System.out.println(answer);
	}
	static boolean isPrime(int n) {
		if (n < 2) return false;

		if (n == 2) return true;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}