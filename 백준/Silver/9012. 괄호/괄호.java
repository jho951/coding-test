import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static String next() throws IOException{
		while (st == null|| !st.hasMoreElements())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}
	static int nextInt() throws IOException{
		return Integer.parseInt(next());
	}

	/**
	 * 괄호 문자열은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열이다.
	 * 그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(VPS)이라고 부른다.
	 * 한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다. 만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다.
	 * 그리고 두 VPS x 와 y를 접합시킨 새로운 문자열 xy도 VPS 가 된다.
	 * 예를 들어 “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” , 그리고 “(()” 는 모두 VPS 가 아닌 문자열3이다.
	 * 여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다.
	 */
	public static void main(String[]args)throws IOException{
		int N = nextInt();
		StringBuilder answer = new StringBuilder();
		while (N-- > 0) {
			String sb = next();
			Stack<Character> stack = new Stack<>();
			boolean isVps = true;
			for (int i = 0; i < sb.length(); i++) {
				char c = sb.charAt(i);

				if (c == '(') {
					stack.push(c);
				} else {
					if (stack.isEmpty()) {
						isVps = false;
						break;
					}
					stack.pop();
				}
			}

			if (isVps && stack.isEmpty()) {
				answer.append("YES\n");
			} else {
				answer.append("NO\n");
			}
		}
		System.out.println(answer);
	}
}
