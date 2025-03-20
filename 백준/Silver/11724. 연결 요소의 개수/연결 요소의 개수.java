import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] resultList;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        resultList = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            resultList[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            resultList[a].add(b);
            resultList[b].add(a);
        }

        int result = 0;

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                dfs(i);
                result++;
            }
        }
        System.out.println(result);
    }

    static void dfs(int node) {
        visited[node] = true;
        for (int next : resultList[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}
