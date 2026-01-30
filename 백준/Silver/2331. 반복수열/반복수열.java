import java.util.*;
import java.io.*;

/**
 * 다음과 같이 정의된 수열이 있다.
 * D[1] = A
 * D[n] = D[n-1]의 각 자리의 숫자를 P번 곱한 수들의 합
 * 예를 들어 A=57, P=2일 때, 수열 D는 [57, 74(25+49), 65, 61, 37, 58, 89, 145, 42, 20, 4, 16, 37, …]이 된다. 그 뒤에는 앞서 나온 수들(57부터가 아니라 58부터)이 반복된다.
 * 이와 같은 수열을 계속 구하다 보면 언젠가 이와 같은 반복수열이 된다. 이때, 반복되는 부분을 제외했을 때, 수열에 남게 되는 수들의 개수를 구하는 프로그램을 작성하시오. 위의 예에서는 [57, 74, 65, 61]의 네 개의 수가 남게 된다.
 *
 * 입력
 * 첫째 줄에 A(1 ≤ A ≤ 9999), P(1 ≤ P ≤ 5)가 주어진다.
 *
 * 출력
 * 첫째 줄에 반복되는 부분을 제외했을 때, 수열에 남게 되는 수들의 개수를 출력한다.
 *
 * 예제 입력 1
 * 57 2
 * 예제 출력 1
 * 4
 *
 *  A(1 ≤ A ≤ 9999), P(1 ≤ P ≤ 5)가 주어진다.
 */

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static String next() throws IOException {
		while(st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}
	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}
	static int[] check = new int[300000];
	static int P;

	public static void main(String[] args) throws IOException {
		int A = nextInt();
		P = nextInt();

		System.out.println(dfs(A, 1));
	}


	static int dfs(int now, int count) {
		if (check[now] != 0) {
			return check[now] - 1;
		}

		check[now] = count; // 현재 숫자의 방문 순서 저장
		int nextValue = getNext(now); // 다음 숫자 계산

		return dfs(nextValue, count + 1);
	}

	static int getNext(int num) {
		int res = 0;
		while (num > 0) {
			res += Math.pow(num % 10, P);
			num /= 10;
		}
		return res;
	}
}