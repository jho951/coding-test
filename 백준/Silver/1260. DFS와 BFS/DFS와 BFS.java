import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	// DFS 관련 변수
	static boolean[] dfsVisited;
	static StringBuilder dfsSb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		int N = nextInt();
		int M = nextInt();
		int start = nextInt();

		// 1. 여기서 TreeSet을 사용하는 것이 핵심!
		Map<Integer, Set<Integer>> map = new HashMap<>();
		for (int i = 1; i <= N; i++)
			map.put(i, new TreeSet<>());

		while (M-- > 0) {
			int a = nextInt();
			int b = nextInt();
			map.get(a).add(b);
			map.get(b).add(a);
		}

		// 2. DFS 실행 (먼저 호출하고 출력)
		dfsVisited = new boolean[N + 1];
		dfs(start, map);
		System.out.println(dfsSb.toString().trim());

		// 3. BFS 실행 (함수 안에서 StringBuilder를 만들어 반환하므로 바로 출력)
		System.out.println(bfs(start, map, N).trim());
	}
	static void dfs(int current, Map<Integer, Set<Integer>> map) {
		dfsVisited[current] = true;
		dfsSb.append(current).append(" ");

		for (int neighbor : map.get(current)) {
			if (!dfsVisited[neighbor]) {
				dfs(neighbor, map);
			}
		}
	}

	static String bfs(int start, Map<Integer, Set<Integer>> map, int n) {
		Deque<Integer> deque = new ArrayDeque<>();
		boolean[] visited = new boolean[n + 1];
		StringBuilder sb = new StringBuilder();

		deque.add(start);
		visited[start] = true;

		while (!deque.isEmpty()) {
			int current = deque.poll();
			sb.append(current).append(" ");

			for (int neighbor : map.get(current)) {
				if (!visited[neighbor]) {
					visited[neighbor] = true;
					deque.add(neighbor);
				}
			}
		}
		return sb.toString();
	}
}