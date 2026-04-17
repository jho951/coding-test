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
		int X = nextInt();
		List<Integer> sticks = new ArrayList<>();
		sticks.add(64);

		// 현재 가지고 있는 막대들의 총합 관리
		int currentSum = 64;

		while (currentSum > X) {
			Collections.sort(sticks);
            
			int shortest = sticks.remove(0);
			int half = shortest / 2;

			if (currentSum - half >= X) {
				sticks.add(half);
				currentSum -= half;
			} else {
				sticks.add(half);
				sticks.add(half);
			}
		}
		System.out.println(sticks.size());
	}
}