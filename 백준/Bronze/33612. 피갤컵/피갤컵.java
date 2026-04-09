import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || !st.hasMoreElements()) {
			String line = br.readLine();
			st = new StringTokenizer(line);
		}
		return st.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}
	static float nextFloat() throws IOException {
		return Float.parseFloat(next());
	}

	public static void main(String[] args) throws Exception {
		int year = 2024;
		int month = 8;
		int N = nextInt() - 1;
		N *= 7;
		int totalMonths = (year * 12) + (month - 1) + N; // 시작 월을 0~11로 변환 후 합산
		year = totalMonths / 12;
		month = (totalMonths % 12) + 1; // 다시 1~12 범위로 복구

		System.out.println(year + " " + month);
	}
}
