import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int cnt = 1;
		boolean result = true;

		for (int i = 0; i < N; i++) {
			int target = arr[i];
			// 주어진 숫자보다 현재 숫자가 작을 경우
			if (target >= cnt) {
				while (target >= cnt) {
					stack.push(cnt++);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			} else {
				// 클 경우
				int n = stack.pop();
				if (n > target) {
					System.out.println("NO");
					result = false;
					break;
				} else {
					sb.append("-\n");
				}
			}
		}

		if (result) System.out.print(sb.toString());
	}
}