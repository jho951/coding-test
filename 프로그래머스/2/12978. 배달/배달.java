import java.util.*;

class Node implements Comparable<Node> {
    int index;
    int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    @Override
    public int compareTo(Node other) {
        return Integer.compare(this.distance, other.distance);
    }
}

class Solution {
    public int solution(int N, int[][] road, int K) {
        // 인접 리스트 생성 (1번부터 N번 마을까지 사용하므로 N+1 크기로 할당)
        List<List<Node>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        // 양방향 도로 정보 입력 (두 마을 간 도로가 여러 개일 수 있으므로 최솟값 저장 또는 그대로 간선 추가)
        for (int[] r : road) {
            int u = r[0];
            int v = r[1];
            int cost = r[2];
            graph.get(u).add(new Node(v, cost));
            graph.get(v).add(new Node(u, cost));
        }

        // 최단 거리 테이블 생성 및 초기화
        int[] dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        // 다익스트라 알고리즘 수행
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(1, 0)); // 1번 마을에서 시작 (거리 0)
        dist[1] = 0;

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int u = current.index;
            int d = current.distance;

            // 이미 처리된 거리보다 크면 무시
            if (dist[u] < d) continue;

            // 인접한 노드 탐색
            for (Node neighbor : graph.get(u)) {
                int next = neighbor.index;
                int nextDist = d + neighbor.distance;

                // 더 짧은 경로가 발견된 경우 갱신
                if (nextDist < dist[next]) {
                    dist[next] = nextDist;
                    pq.offer(new Node(next, nextDist));
                }
            }
        }

        // K 시간 이하로 배달 가능한 마을 개수 카운트
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            if (dist[i] <= K) {
                answer++;
            }
        }

        return answer;
    }
}
