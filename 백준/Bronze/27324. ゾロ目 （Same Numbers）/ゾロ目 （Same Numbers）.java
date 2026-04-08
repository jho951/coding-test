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
		String temp = String.valueOf(N);
		char[] charArray = temp.toCharArray();
		if(charArray[0] != charArray[1]){
			System.out.println(0);
		}else{
			System.out.println(1);
		}
	}
}