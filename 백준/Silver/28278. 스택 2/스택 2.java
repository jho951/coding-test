/**
 * 기본 템플릿
 */
import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}
	static int nextInt() throws IOException { return Integer.parseInt(next()); }

	public static void main(String[] args) throws Exception {
		int N = nextInt();
		Stack<Integer>stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			int cmd = nextInt();
			switch (cmd) {
				case 1:
					stack.push(nextInt());
					break;
				case 2:
					if (stack.isEmpty()) {
						sb.append(-1).append("\n");
					}else{
						sb.append(stack.pop()).append("\n");
					}
					break;
				case 3:
					sb.append(stack.size()).append("\n");
					break;
				case 4:
					if(stack.isEmpty()){
						sb.append(1).append("\n");
					}else{
						sb.append(0).append("\n");
					}
					break;
				case 5:
					if(stack.isEmpty()) {
						sb.append(-1).append("\n");
					}else{
						sb.append(stack.peek()).append("\n");
					}
					break;
			}
		}
		System.out.println(sb);
	}
}