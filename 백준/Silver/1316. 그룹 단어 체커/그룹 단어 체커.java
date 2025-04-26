import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int groupWordCount = 0;

		for (int i = 0; i < N; i++) {
			String word = scanner.next();
			if (isGroupWord(word)) {
				groupWordCount++;
			}
		}

		System.out.println(groupWordCount);
	}

	private static boolean isGroupWord(String word) {
		boolean[] visited = new boolean[26];
		char prevChar = 0;

		for (int i = 0; i < word.length(); i++) {
			char currentChar = word.charAt(i);

			if (currentChar != prevChar) {
				if (visited[currentChar - 'a']) {
					return false;
				}
				visited[currentChar - 'a'] = true;
			}

			prevChar = currentChar;
		}

		return true;
	}
}
