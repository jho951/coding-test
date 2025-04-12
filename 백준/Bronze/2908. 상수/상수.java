import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		String A = stringTokenizer.nextToken();
		String B = stringTokenizer.nextToken();
		StringBuilder reverseA = new StringBuilder();
		StringBuilder reverseB = new StringBuilder();
		reverseA.append(A).reverse();
		reverseB.append(B).reverse();
		int result = Math.max(Integer.parseInt(reverseA.toString()), Integer.parseInt(reverseB.toString()));
		System.out.println(result);
	}
}
