import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().trim();

		if (input.isEmpty()) {
			System.out.println(0);
		} else {
			String[] result = input.split(" ");
			System.out.println(result.length);
		}
	}
}