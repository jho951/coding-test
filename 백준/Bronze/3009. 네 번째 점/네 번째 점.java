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
	public static void main(String[] args) throws IOException {
		int[] point1 = {nextInt(),nextInt()};
		int[] point2 = {nextInt(),nextInt()};
		int[] point3 = {nextInt(),nextInt()};
		int x = point1[0] ^ point2[0] ^ point3[0];
		int y = point1[1] ^ point2[1] ^ point3[1];
		System.out.println(x + " " + y);
	}
}
