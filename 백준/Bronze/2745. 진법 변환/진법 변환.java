import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력 받기
		String N = sc.next(); // B진법 수
		int B = sc.nextInt(); // 진법 (2 ≤ B ≤ 36)

		// 진법 변환
		int decimal = 0;
		int power = 1; // 자리수 제곱을 위해 사용

		for (int i = N.length() - 1; i >= 0; i--) {
			char ch = N.charAt(i);
			int digit;

			if (Character.isDigit(ch)) {
				digit = ch - '0';
			} else {
				digit = ch - 'A' + 10;
			}

			decimal += digit * power;
			power *= B;
		}

		System.out.println(decimal);
	}
}
