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
		int N = nextInt();
		int answer = 0;
		for(int i = 0; i < N; i++) {
			int page = nextInt();
			if(page % 2 == 0) {
				answer += page / 2;
			}else{
				answer += (page + 1) / 2;
			}
		}
		System.out.println(answer);
	}
}
