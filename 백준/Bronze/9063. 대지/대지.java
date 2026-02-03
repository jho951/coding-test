import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}
	public static void main(String[] args) throws IOException {
		int N = nextInt();
		int[] list1 = new int[N];
		int[] list2 = new int[N];
		while (N-- > 0) {
			list1[N] = nextInt();
			list2[N] = nextInt();
		}
		Arrays.sort(list1);
		Arrays.sort(list2);

		int x = list1[list1.length - 1] - list1[0];
		int y = list2[list2.length - 1] - list2[0];
		System.out.println(x * y);
	}
}
