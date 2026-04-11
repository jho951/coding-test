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
	static long nextLong() throws IOException {
		return Long.parseLong(next());
	}
	public static void main(String[] args) throws IOException {
		int T = nextInt();
		int N = 0;
		for (int t = 0; t < T; t++) {
			int point = nextInt();
			if(point == 1){
				N++;
			}else if(point == -1){
				N--;
			}
		}
		if(N > 0){
			System.out.println("Right");
		}else if((N < 0)){
			System.out.println("Left");
		}else{
			System.out.println("Stay");
		}
	}
}
