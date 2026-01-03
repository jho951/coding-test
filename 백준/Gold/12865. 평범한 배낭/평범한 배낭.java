import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		// 최대 개수
		int N = Integer.parseInt(st.nextToken());
		// 최대 무게
		int K = Integer.parseInt(st.nextToken());

		// 최대 가치
		int[] dp = new int[K + 1];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(in.readLine());
			int W = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());

			// K부터 W까지 거꾸로 내려오며 계산 (중복 계산 방지)
			for (int j = K; j >= W; j--) {
				dp[j] = Math.max(dp[j], dp[j - W] + V);
			}
		}

		// 배낭 무게 K일 때의 최댓값 출력
		System.out.println(dp[K]);
	}
}