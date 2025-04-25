import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();

		String[] croatian = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};

		for (String letter : croatian) {
			word = word.replace(letter, "*");  // 크로아티아 알파벳을 임시 문자로 치환
		}

		System.out.println(word.length());
	}
}
