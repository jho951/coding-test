import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] tri = new int[45];
		for (int i = 1; i < 45; i++) tri[i - 1] = i * (i + 1) / 2;

		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			int K = Integer.parseInt(br.readLine());
			System.out.println(solve(tri, K));
		}
	}

	static int solve(int[] tri, int K) {
		for (int i = 0; i < 44; i++) {
			for (int j = 0; j < 44; j++) {
				for (int l = 0; l < 44; l++) {
					if (tri[i] + tri[j] + tri[l] == K) {
						return 1;
					}
				}
			}
		}
		return 0;
	}
}