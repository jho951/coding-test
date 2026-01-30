import java.util.*;
import java.io.*;

/**
 * 문제
 * 방향 없는 그래프가 주어졌을 때, 연결 요소 (Connected Component)의 개수를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 정점의 개수 N과 간선의 개수 M이 주어진다. (1 ≤ N ≤ 1,000, 0 ≤ M ≤ N×(N-1)/2)
 * 둘째 줄부터 M개의 줄에 간선의 양 끝점 u와 v가 주어진다. (1 ≤ u, v ≤ N, u ≠ v)
 * 같은 간선은 한 번만 주어진다.
 *
 * 출력
 * 첫째 줄에 연결 요소의 개수를 출력한다.
 */
// dfs 타고 타고 가서 방문한데면, cnt 올리고, 다음 꺼 진행

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static String next() throws IOException{
		while(st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}
	static int nextInt() throws IOException{
		return Integer.parseInt(next());
	}
	public static void main(String[] args) throws IOException{
		int N = nextInt();
		int M = nextInt();
		Map<Integer, Set<Integer>> map = new HashMap<>();
		for (int i = 1; i <= N; i++) map.put(i, new HashSet<>());
		while(M-->0) {
			int a = nextInt();
			int b = nextInt();
			map.get(a).add(b);
			map.get(b).add(a);
		}
		boolean[]visited = new boolean[N + 1];
		int count = 0;
		for (int i = 1; i <= N; i++) {
			if (!visited[i]) {
				dfs(i, map, visited);
				count++;
			}
		}
		System.out.println(count);
	}
	static void dfs(int start, Map<Integer, Set<Integer>>map, boolean[] visited) {
		visited[start] = true;
		for (int next : map.get(start)) {
			if (!visited[next]) {
				dfs(next, map, visited);
			}
		}
	}
}
