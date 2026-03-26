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
		while(true) {
			String str = next();
			if(str.equals("end"))break;
			switch(str) {
				case "animal":
					System.out.println("Panthera tigris");
					break;
				case "flower":
					System.out.println("Forsythia koreana");
					break;
				case "tree":
					System.out.println("Pinus densiflora");
					break;
			}
		}
	}
}