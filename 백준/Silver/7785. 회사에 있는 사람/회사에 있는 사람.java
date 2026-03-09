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
		Map<String, String>map = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++){
			String person = next();
			String status = next();
			if (status.equals("leave")) {map.remove(person);}
			else {map.put(person, status);}
		}
		List<String> remaining = new ArrayList<>(map.keySet());
		remaining.sort(Collections.reverseOrder());
		for(String person : remaining){sb.append(person).append("\n");}
		System.out.println(sb);
	}
}