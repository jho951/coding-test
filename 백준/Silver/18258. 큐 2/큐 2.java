import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
       while (st == null || !st.hasMoreTokens()) {
          String line = br.readLine();
          if (line == null) return null;
          st = new StringTokenizer(line);
       }
       return st.nextToken();
    }
    static int nextInt() throws IOException {
       return Integer.parseInt(next());
    }

    public static void main(String[] args) throws Exception {
       int N = nextInt();
       // ArrayDeque는 큐 구현에 매우 빠르고 효율적입니다.
       Deque<Integer> deque = new ArrayDeque<>();
       StringBuilder sb = new StringBuilder();
       
       for(int i = 0; i < N; i++){
          String str = next();
          switch (str){
             case "push":
                deque.addLast(nextInt()); 
                break;
             case "pop":
                if(!deque.isEmpty()){
                   // 큐는 FIFO이므로 가장 앞의 원소를 제거하고 출력합니다.
                   sb.append(deque.pollFirst()).append("\n"); 
                } else {
                   sb.append("-1").append("\n");
                }
                break;
             case "size":
                sb.append(deque.size()).append("\n");
                break;
             case "empty":
                sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                break;
             case "front":
                sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n");
                break;
             case "back": // 문제에 명시된 명령어는 'back'입니다.
                sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
                break;
          }
       }
       // 마지막에 한 번에 출력 (시간 초과 방지)
       System.out.print(sb);
    }
}