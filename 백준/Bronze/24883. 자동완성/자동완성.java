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
		if(str.equals("N") || str.equals("n")){
			System.out.println("Naver D2");
		}else{
			System.out.println("Naver Whale");
		}
	}
}