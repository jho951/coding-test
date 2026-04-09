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
		int hour = nextInt();
		int minute = nextInt();
		int second = nextInt();
		int num = nextInt();

		second += num;
		minute += second / 60;
		second %= 60;

		hour += minute / 60;
		minute %= 60;
		hour %= 24;

		System.out.println(hour + " " + minute + " " + second);
	}
}