import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || !st.hasMoreElements()) {
			st = new StringTokenizer(br.readLine());
		}
		return st.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}


	public static void main(String[] args) throws Exception {
		int N = nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[0] * arr[arr.length - 1]);
	}
}