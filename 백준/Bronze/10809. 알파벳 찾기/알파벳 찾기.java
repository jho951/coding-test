import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		scanner.close();

		int[] positions = new int[26];

		for (int i = 0; i < 26; i++) {
			positions[i] = -1;
		}

		// 각 알파벳의 처음 등장 위치 기록
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int index = ch - 'a'; // 'a'는 0, 'b'는 1, ..., 'z'는 25
			if (positions[index] == -1) {
				positions[index] = i; // 처음 등장하는 위치만 기록
			}
		}

		// 결과 출력
		for (int i = 0; i < 26; i++) {
			System.out.print(positions[i] + " ");
		}
	}
}
