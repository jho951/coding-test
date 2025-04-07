import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		while (N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int K = Integer.parseInt(st.nextToken());
			String[] tokens = st.nextToken().split("");
			String result="";
			for (int i = 0; i <tokens.length ; i++) {
				result +=tokens[i].repeat(K);
			}
			System.out.println(result);
		}

	}
}
