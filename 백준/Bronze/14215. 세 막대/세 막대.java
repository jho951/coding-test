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
		int[] n = {nextInt(),nextInt(),nextInt()};
		Arrays.sort(n);
		if(n[2] < n[0] + n[1]){
			System.out.println(n[0] + n[1] + n[2]);
		}else{
			System.out.println(n[0] + n[1] + n[2] - (n[2] - n[1] - n[0] + 1));
		}

	}
}