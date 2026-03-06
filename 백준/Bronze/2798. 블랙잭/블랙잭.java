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
		int M = nextInt();
		int[] list = new int[N];

		int answer = 0;
		for(int i = 0; i< list.length; i++){
			list[i] = nextInt();
		}
		Arrays.sort(list);
		for(int i = 0; i< list.length; i++){
			for(int j = i+1; j< list.length; j++){
				for(int k = j+1; k< list.length; k++){
					if(list[i] + list[j] + list[k] == M){
						answer = M;
					}else{
						if(list[i] + list[j] + list[k] < M){
							answer = Math.max(answer, list[i] + list[j] + list[k]);
						}
					}
				}
			}
		}
		System.out.println(answer);
	}
}