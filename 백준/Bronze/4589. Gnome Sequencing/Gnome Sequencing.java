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
	static int STICK_LENGTH = 64;


	public static void main(String[] args) throws IOException {
		int N = nextInt();
		System.out.println("Gnomes:");
		for(int i = 0; i < N; i++) {
			int[] temp = new int[3];
			int X = nextInt();
			int Y = nextInt();
			int Z = nextInt();
			temp[0] = X;
			temp[1] = Y;
			temp[2] = Z;
			Arrays.sort(temp);
			if(temp[0] == X && temp[1] == Y && temp[2] == Z) {
				System.out.println("Ordered");
			}else if(temp[0] == Z && temp[1] == Y && temp[2] == X){
				System.out.println("Ordered");
			}else{
				System.out.println("Unordered");
			}
		}
	}
}