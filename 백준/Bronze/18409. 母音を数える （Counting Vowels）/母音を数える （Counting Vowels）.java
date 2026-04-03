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
		char[] str = next().toCharArray();
		int answer = 0;
		for (int i = 0; i < N; i++) {
			if (str[i] == 'a') {
				answer++;
			}else if (str[i] == 'e') {
				answer++;
			}else if (str[i] == 'o') {
				answer++;
			}else if (str[i] == 'i') {
				answer++;
			}else if (str[i] == 'u') {
				answer++;
			}
		}
		System.out.println(answer);
	}
}