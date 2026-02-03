import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}
	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}
	public static void main(String[] args)throws IOException {
		int[] curPos = {nextInt(), nextInt()};
		int[] start = {0,0};
		int[] end = {nextInt(), nextInt()};

		System.out.println(Math.min(Math.min(curPos[0] - start[0], end[0] - curPos[0]), Math.min(curPos[1] - start[1], end[1] - curPos[1])));
	}
}
