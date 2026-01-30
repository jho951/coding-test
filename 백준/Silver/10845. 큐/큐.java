import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        // Queue 인터페이스와 LinkedList 구현체 사용
        LinkedList<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    queue.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(queue.isEmpty() ? -1 : queue.peekFirst()).append("\n");
                    break;
                case "back":
                    sb.append(queue.isEmpty() ? -1 : queue.peekLast()).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}