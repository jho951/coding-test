import java.io.*;
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

	public static void main(String[] args) throws Exception {
		int[] arr = new int[3];
		for(int arr_i=0; arr_i < 3; arr_i++){
			arr[arr_i] = nextInt();
		}
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		for(int arr_i=0; arr_i < 3; arr_i++){
			sb.append(arr[arr_i]).append(" ");
		}
		System.out.println(sb);
	}
}