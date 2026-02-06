import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] cards = new int[N];

		for (int i = 0; i < N; i++) {
			cards[i] = sc.nextInt();
		}

		Arrays.sort(cards);

		int result = 0;

		for (int i = 0; i < N - 2; i++) {
			int left = i + 1;
			int right = N - 1;

			while (left < right) {
				int sum = cards[i] + cards[left] + cards[right];
				// 값이 같으면 더 이상 필요없다.
				if (sum == M) {
					System.out.println(M);
					return;
				}
				// 크면
				if (sum < M) {
					result = Math.max(result, sum);
					left++;
				}
				// 작으면
				else {
					right--;
				}
			}
		}

		System.out.println(result);
	}
}