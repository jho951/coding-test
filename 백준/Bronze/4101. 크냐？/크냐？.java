import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || !st.hasMoreElements()) {
			st = new StringTokenizer(br.readLine());
		}
		return st.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}


	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		while(true){
			int A = nextInt();
			int B = nextInt();
			if( A == 0 && B == 0){
				break;
			}else{
				if(A > B){
					sb.append("Yes").append("\n");
				}else {
					sb.append("No").append("\n");
				}
			}
		}

		System.out.println(sb.toString());
	}
}