import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static String next()throws IOException {
		while(st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine()); return st.nextToken();
	}
	static int nextInt()throws IOException{
		return Integer.parseInt(next());
	}
	public static void main(String[] args) throws Exception {
		int X = nextInt();
		int line = 1;
		int countSum = 0;

		while (true) {
			if (X <= countSum + line) {
				break;
			}
			countSum += line;
			line++;
		}
		int pos = X - countSum;

		if (line % 2 == 0) {
			System.out.println(pos + "/" + (line - pos + 1));
		} else {
			System.out.println((line - pos + 1) + "/" + pos);
		}
	}
}
