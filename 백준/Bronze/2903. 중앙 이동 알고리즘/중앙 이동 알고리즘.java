import java.util.*;
import java.io.*;

/**
 * 점을 찍고,
 */
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static String next()throws IOException{
		while(st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine()); return st.nextToken();
	}
	static int nextInt()throws IOException{
		return Integer.parseInt(next());
	}
	public static void main(String[] args) throws IOException {
		int N = nextInt();
		System.out.println((int)Math.pow(Math.pow(2, N)+1, 2));
	}
}
