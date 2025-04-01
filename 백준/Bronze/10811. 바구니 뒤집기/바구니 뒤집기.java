import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();

		// 초기 바구니 상태 (1~N)
		List<Integer> baskets = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			baskets.add(i);
		}

		for (int m = 0; m < M; m++) {
			int i = scanner.nextInt() - 1;
			int j = scanner.nextInt();   

			Collections.reverse(baskets.subList(i, j));
		}
		for (int num : baskets) {
			System.out.print(num + " ");
		}
	}
}