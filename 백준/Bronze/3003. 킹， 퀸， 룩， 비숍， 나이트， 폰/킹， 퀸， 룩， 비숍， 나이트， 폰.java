import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int king = Integer.parseInt(st.nextToken());
		int queen = Integer.parseInt(st.nextToken());
		int rock = Integer.parseInt(st.nextToken());
		int vi = Integer.parseInt(st.nextToken());
		int knight = Integer.parseInt(st.nextToken());
		int porn = Integer.parseInt(st.nextToken());
		System.out.print(1 - king + " ");
		System.out.print(1 - queen+ " ");
		System.out.print(2 - rock+ " ");
		System.out.print(2 - vi+ " ");
		System.out.print(2 - knight+ " ");
		System.out.print(8 - porn+ " ");
	}
}
