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

	static int Bcd(int n, int k) {
		int count = 1;
		while (true) {
			if(k * count % n == 0 ){
				return k * count;
			}else{
				count++;
			}
		}
	}
	public static void main(String[] args) throws Exception {
		int N = nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++){
			int a = nextInt();
			int b = nextInt();
			sb.append(Bcd(a, b)).append('\n');
		}
		System.out.println(sb);
	}
}