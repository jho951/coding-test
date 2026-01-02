import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		long n = sc.nextLong();
		int b = sc.nextInt();

		while (n > 0) {
			long remainder = n % b;

			if (remainder < 10) {
				sb.append(remainder);
			} else {
				sb.append((char)(remainder - 10 + 'A'));
			}
			n /= b;
		}
		System.out.println(sb.reverse().toString());
	}
}