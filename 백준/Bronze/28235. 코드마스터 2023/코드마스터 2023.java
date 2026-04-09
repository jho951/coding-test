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

	public static void main(String[] args) throws Exception {
		String str = next();
		switch (str) {
			case"SONGDO":
				System.out.println("HIGHSCHOOL");
				break;
			case"CODE":
				System.out.println("MASTER");
				break;
			case"2023":
				System.out.println("0611");
				break;
			case"ALGORITHM":
				System.out.println("CONTEST");
				break; 
 			default: 
				 System.out.println("ERROR");
		}
	}
}
