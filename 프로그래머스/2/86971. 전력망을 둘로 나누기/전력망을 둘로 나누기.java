import java.util.*;

class Solution {
    // 그래프 관계를 저장할 인접 행렬
    static int[][] adjMatrix;

    public int solution(int n, int[][] wires) {
        int answer = n; // 최대 차이는 n을 넘을 수 없으므로 n으로 초기화
        adjMatrix = new int[n + 1][n + 1];

        // 1. 그래프 생성 (양방향)
        for (int[] wire : wires) {
            int v1 = wire[0];
            int v2 = wire[1];
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }

        // 2. 전선을 하나씩 끊어보며 완전탐색
        for (int[] wire : wires) {
            int v1 = wire[0];
            int v2 = wire[1];

            // 전선 끊기
            adjMatrix[v1][v2] = 0;
            adjMatrix[v2][v1] = 0;

            // 끊어진 상태에서 1번 송전탑과 연결된 서브 트리 크기 구하기
            int count = bfs(1, n);

            // 두 전력망의 송전탑 개수 차이 계산
            int diff = Math.abs(count - (n - count));
            
            // 최솟값 갱신
            answer = Math.min(answer, diff);

            // 전선 다시 복구하기
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }

        return answer;
    }

    // 연결된 송전탑의 개수를 세는 BFS 메서드
    private int bfs(int start, int n) {
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        visited[start] = true;
        int count = 1; // 시작 노드 포함

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int i = 1; i <= n; i++) {
                // 연결되어 있고 아직 방문하지 않은 송전탑이 있다면
                if (adjMatrix[current][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                    count++; // 개수 누적
                }
            }
        }
        return count;
    }
}
