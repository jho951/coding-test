/**
 * 기본 템플릿
 */
import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}
	static int nextInt() throws IOException { return Integer.parseInt(next()); }

	public static void main(String[] args) throws Exception {
		int N = nextInt();
		int[][] arr = new int[N][2];
		for (int i = 0; i < N; i++) {
			arr[i][0] = nextInt();
			arr[i][1] = nextInt();
		}
		Arrays.sort(arr, new PointComparator());

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(arr[i][0]).append(" ").append(arr[i][1]).append('\n');
		}
		System.out.println(sb);
	}

	static class PointComparator implements Comparator<int[]> {
		public int compare(int[] e1, int[] e2) {
			// 1. y좌표(index 1)가 같다면 x좌표(index 0)를 비교
			if (e1[1] == e2[1]) {
				return e1[0] - e2[0]; // x좌표 오름차순
			}
			// 2. y좌표가 다르면 y좌표를 기준으로 비교
			else {
				return e1[1] - e2[1]; // y좌표 오름차순
			}
		}
	}
}