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



	public static void main(String[] args) throws Exception {
		String str = next();
		String docStr = next();
		if(str.contains(docStr)) {
			System.out.println("go");
		}else{
			System.out.println("no");
		}
	}
}