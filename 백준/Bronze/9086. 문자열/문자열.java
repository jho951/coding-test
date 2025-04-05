import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int N =Integer.parseInt(bufferedReader.readLine());
		while (N-- > 0) {
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			String[] tokens = stringTokenizer.nextToken().split("");
			if (tokens.length < 2) {
				System.out.println(tokens[0]+tokens[0]);
			}else{
				System.out.println(tokens[0]+tokens[tokens.length-1]);
			}
		}
	}
}
