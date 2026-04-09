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
			StringBuilder sb = new StringBuilder();
			String name = next();
			sb.append(name).append(" ");
			int age = nextInt();
			int weight = nextInt();
			if(name.equals("#") && age == 0 && weight == 0) break;

			if(age < 18 && weight < 80){
				sb.append("Junior");
			}else{
				sb.append("Senior");
			}
			System.out.println(sb);
		}
	}
}