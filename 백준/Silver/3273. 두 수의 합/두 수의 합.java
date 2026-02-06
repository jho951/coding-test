import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || !st.hasMoreElements())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public static void main(String[] args) throws IOException {
		int N = nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = nextInt(); 
		}

		Arrays.sort(arr);
		int M = nextInt();
		int result = 0;
			int start =  0;
			int end = N - 1;

			// 2. 투 포인터 탐색 (O(N))
			while (start < end) {
				int sum = arr[start] + arr[end];

				if (sum == M) {
					result++;    // 쌍을 찾았음!
					start++;     // 다음 쌍을 찾기 위해 이동
					end--;       // 다음 쌍을 찾기 위해 이동
				} else if (sum < M) {
					start++;     // 합이 작으면 작은 쪽을 키움
				} else {
					end--;       // 합이 크면 큰 쪽을 줄임
				}
			}
		System.out.println(result);
	}
}