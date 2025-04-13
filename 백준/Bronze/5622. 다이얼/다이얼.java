import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String[] words = st.nextToken().split("");
		int result=	solve(words);
		System.out.println(result);
	}

	public static int solve(String[] words) {
		int count=0;
		String[] dial = {
			"ABC",
			"DEF",
			"GHI",
			"JKL",
			"MNO",
			"PQRS",
			"TUV",
			"WXYZ"
		};
		for (String word : words) {
			for (char c : word.toCharArray()) {
				for (int i = 0; i < dial.length; i++) {
					if (dial[i].indexOf(c) != -1) {
						count += i + 3;
					}
				}
			}
		}
		return count;
	}
}
