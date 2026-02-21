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
		String s = next();
		if (s == null) return -1;
		return Integer.parseInt(s);
	}

	public static void main(String[] args) throws Exception {
		int n;
		// n에 입력값을 저장하고 -1인지 확인
		while ((n = nextInt()) != -1) {
			List<Integer> divisors = new ArrayList<>();
			int sum = 0;

			// 1부터 n-1까지 약수 구하기
			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					divisors.add(i);
					sum += i;
				}
			}

			// 결과 출력
			if (sum == n) {
				System.out.print(n + " = ");
				for (int i = 0; i < divisors.size(); i++) {
					System.out.print(divisors.get(i));
					if (i < divisors.size() - 1) System.out.print(" + ");
				}
				System.out.println();
			} else {
				System.out.println(n + " is NOT perfect.");
			}
		}
	}
}
