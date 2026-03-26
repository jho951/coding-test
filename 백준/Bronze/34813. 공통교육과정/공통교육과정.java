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
		String str = next();
		if(str.startsWith("F")){
			System.out.println("Foundation");
		}else if(str.startsWith("C")){
			System.out.println("Claves");
		}else if(str.startsWith("V")){
			System.out.println("Veritas");
		}else if(str.startsWith("E")){
			System.out.println("Exploration");
		}

	}
}