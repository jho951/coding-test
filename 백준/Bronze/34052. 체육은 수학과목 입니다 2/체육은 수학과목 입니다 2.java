import java.io.*;
import java.math.BigInteger;
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
	static float nextFloat() throws IOException {
		return Float.parseFloat(next());
	}

	public static void main(String[] args) throws Exception {
		int record = 0;
		for (int i = 0; i < 4; i++) {
			record += nextInt();
		}
		if(record + 300 > 1800){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
}
