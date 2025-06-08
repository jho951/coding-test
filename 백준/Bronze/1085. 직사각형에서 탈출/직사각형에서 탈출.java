import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int[] mx = new int[4];
		mx[0] = Integer.parseInt(input[0]);
		mx[1] = Integer.parseInt(input[1]);
		mx[2] = Integer.parseInt(input[2]) - Integer.parseInt(input[0]);
		mx[3] = Integer.parseInt(input[3]) - Integer.parseInt(input[1]);
		System.out.println(Math.min(Math.min(mx[0], mx[1]), Math.min(mx[2], mx[3])));
	}
}
