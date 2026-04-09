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
		int[] max = new int[3];
		int[] mel = new int[3];
		for (int i = 0; i < max.length; i++) {
			max[i] = nextInt();
		}
		for (int i = 0; i < mel.length; i++) {
			mel[i] = nextInt();
		}
		int compare1 = 3 * max[0] + 20 * max[1] + 120 * max[2];
		int compare2 = 3 * mel[0] + 20 * mel[1] + 120 * mel[2];

		if(compare1 < compare2) {
			System.out.println("Mel");
		}else if(compare1 > compare2) {
			System.out.println("Max");
		}else{
			System.out.println("Draw");
		}
	}
}
