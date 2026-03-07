import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// 멤버 정보를 담을 클래스 정의
	static class Member {
		int age;
		String name;
		int idx; // 입력 순서 저장 (사실 Java 정렬은 Stable해서 필수까진 아님)

		public Member(int age, String name, int idx) {
			this.age = age;
			this.name = name;
			this.idx = idx;
		}
	}

	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(br.readLine());
		Member[] members = new Member[N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			members[i] = new Member(age, name, i);
		}

		// 정렬 로직
		Arrays.sort(members, (m1, m2) -> {
			// 1. 나이 순으로 오름차순 정렬
			if (m1.age != m2.age) {
				return m1.age - m2.age;
			}
			// 2. 나이가 같다면? 입력 순서(idx)대로 정렬
			return m1.idx - m2.idx;
		});

		// 결과 출력
		StringBuilder sb = new StringBuilder();
		for (Member m : members) {
			sb.append(m.age).append(" ").append(m.name).append("\n");
		}
		System.out.print(sb);
	}
}