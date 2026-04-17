import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static String next() throws IOException {
		while (st == null || !st.hasMoreElements()) {
			String line = br.readLine();
			st = new StringTokenizer(line);
		}
		return st.nextToken();
	}
	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}
	static int STICK_LENGTH = 64;


	public static void main(String[] args) throws IOException {
		// 1. 입력 받기
		int X = nextInt();

		// 2. 초기 세팅: 64cm 막대 하나로 시작
		List<Integer> sticks = new ArrayList<>();
		sticks.add(64);

		// 현재 가지고 있는 막대들의 총합 관리
		int currentSum = 64;

		// 3. 합이 X보다 큰 동안 반복 (문제의 조건)
		while (currentSum > X) {
			// 가장 짧은 막대를 찾기 위해 정렬 (오름차순)
			Collections.sort(sticks);

			// 가장 짧은 것 꺼내기 (0번 인덱스)
			int shortest = sticks.remove(0);
			int half = shortest / 2;

			// [남은 막대들의 합 + 자른 반쪽 하나]가 X보다 크거나 같은지 확인
			// currentSum에서 half 하나를 뺀 것과 같음
			if (currentSum - half >= X) {
				// 조건을 만족하면 하나를 버림 (즉, 하나만 리스트에 다시 넣음)
				sticks.add(half);
				currentSum -= half;
			} else {
				// 조건을 만족하지 못하면 버리지 못함 (둘 다 다시 넣음)
				sticks.add(half);
				sticks.add(half);
				// 전체 합 currentSum은 변화 없음 (shortest = half + half 이므로)
			}
		}

		// 4. 결과 출력: 리스트에 남아있는 막대의 개수
		System.out.println(sticks.size());
	}
}