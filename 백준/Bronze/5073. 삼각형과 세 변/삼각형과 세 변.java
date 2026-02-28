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
		StringBuilder sb = new StringBuilder();
		while(true){
			int[] n = {nextInt(),nextInt(),nextInt()};
			if(n[0] == 0) break;
			Arrays.sort(n);
			if(n[2] >= n[0] + n[1]) {
				sb.append("Invalid").append("\n");
			}else if(n[0] == n[1] || n[1] == n[2] || n[2] == n[0]) {
				if (n[0] + n[1] == 2 * n[2]) {
					sb.append("Equilateral").append("\n");
				} else {
					sb.append("Isosceles").append("\n");
				}
			}else {
					sb.append("Scalene").append("\n");
				}
			}
		System.out.println(sb.toString());
	}
}