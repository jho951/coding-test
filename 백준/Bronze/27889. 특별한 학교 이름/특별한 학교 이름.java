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
			case"NLCS":
				System.out.println("North London Collegiate School");
				break;
			case "BHA":
				System.out.println("Branksome Hall Asia");
				break;
			case "KIS":
				System.out.println("Korea International School");
				break;
			case "SJA":
				System.out.println("St. Johnsbury Academy");
				break;
		}
	}
}
