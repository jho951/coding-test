import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int n = Integer.parseInt(stringTokenizer.nextToken());
		int k = Integer.parseInt(stringTokenizer.nextToken());
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < k; i++) {
			StringTokenizer stringTokenizer1 = new StringTokenizer(bufferedReader.readLine());
			int index1 = Integer.parseInt(stringTokenizer1.nextToken()) - 1;
			int index2 = Integer.parseInt(stringTokenizer1.nextToken()) - 1;
			int temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
