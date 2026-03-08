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

	static class Member{
		int age;
		String name;
		int id;
		public Member(int age, String name,int id) {
			this.age = age;
			this.name = name;
			this.id = id;
		}
	}

	public static void main(String[] args) throws Exception {
		int N = nextInt();
		Member[] members = new Member[N];
		for (int i = 0; i < N; i++) {
			int age = nextInt();
			String name = next();
			members[i] = new Member(age, name, i);
		}
		Arrays.sort(members,(m1,m2)-> {
				if(m1.age != m2.age){
					return m1.age - m2.age;
				}
				return m1.id - m2.id;
		});
		StringBuilder sb = new StringBuilder();
			for (Member m : members) {
				sb.append(m.age).append(" ").append(m.name).append("\n");
			}
			System.out.print(sb);
	}
}







