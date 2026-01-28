 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		int cnt = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// 컴퓨터 수
		int n = Integer.parseInt(reader.readLine());
		// 컴퓨터 쌍의 수
		int m = Integer.parseInt(reader.readLine());
		List<Integer>[] list = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			list[i] = new ArrayList<>();
		}

		// 2. 연결 정보 입력 (m만큼 반복)
		for (int i = 0; i < m; i++) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			int x = Integer.parseInt(tokenizer.nextToken());
			int y = Integer.parseInt(tokenizer.nextToken());

			// 양방향 연결!!
			list[x].add(y);
			list[y].add(x);
		}
        boolean[] visited = new boolean[n + 1];
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		visited[1] = true;
		while (!queue.isEmpty()) {
			// 큐에서 하나 꺼내기 (현재 검사할 컴퓨터)
			int curr = queue.poll();

			// 현재 컴퓨터와 연결된 모든 컴퓨터(next)를 확인
			for (int next : list[curr]) {
				// 아직 방문하지 않은 컴퓨터라면?
				if (!visited[next]) {
					visited[next] = true; // 방문 표시 (감염됨)
					queue.add(next);    // 다음 탐색을 위해 큐에 넣기
					cnt++;            // 감염된 수 증가
				}
			}
		}

		// 3. 1번을 제외하고 새롭게 감염된 컴퓨터 수 출력
		System.out.println(cnt);
	}
}
