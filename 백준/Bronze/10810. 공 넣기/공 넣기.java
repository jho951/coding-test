import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer br = new StringTokenizer(bufferedReader.readLine());
		int n = Integer.parseInt(br.nextToken());
		int k = Integer.parseInt(br.nextToken());
		Integer[] arr = new Integer[n];

		for (int i = 0; i < k; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int a = Integer.parseInt(stringTokenizer.nextToken()) - 1;
			int b = Integer.parseInt(stringTokenizer.nextToken()) - 1;
			int c = Integer.parseInt(stringTokenizer.nextToken());
			for (int j = a; j <= b; j++) {
				arr[j] = c;
			}
		}
		for (int i = 0; i < n; i++) {
			if(arr[i]==null){
				arr[i]=0;
			}
			System.out.print(arr[i]+" ");
		}
	}
}
