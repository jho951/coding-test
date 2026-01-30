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
	public static void main(String[] args) throws IOException{
		int N = nextInt();
		List<Integer>list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		while (N-- > 0) {
			switch (next()) {
				case "push":
					list.add(nextInt());
					break;
				case "pop":
					if (list.isEmpty()) {
						sb.append("-1\n");
					} else {
						sb.append(list.remove(list.size() - 1)).append("\n");
					}
					break;
				case "size":
					sb.append(list.size()).append("\n");
					break;
				case "empty":
					sb.append(list.isEmpty() ? "1\n" : "0\n");
					break;
				case "top":
					if (list.isEmpty()) {
						sb.append("-1\n");
					} else {
						sb.append(list.get(list.size() - 1)).append("\n");
					}
					break;
			}
		}
		System.out.print(sb);
	}
}
