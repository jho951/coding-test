import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Long N = Long.parseLong(reader.readLine());
		System.out.println(N * N * N);
		System.out.println(3);
	}
}
