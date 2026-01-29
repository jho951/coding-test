class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, n, computers, visited);
                answer++;
            }
        }
        return answer;
    }

    private void dfs(int current, int n, int[][] computers, boolean[] visited) {
        visited[current] = true;

        for (int next = 0; next < n; next++) {
            if (current != next && computers[current][next] == 1 && !visited[next]) {
                dfs(next, n, computers, visited); // 연결된 컴퓨터로 깊게 탐색
            }
        }
    }
}