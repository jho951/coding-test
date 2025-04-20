import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] matrix = new int[9][9];
		int maxValue = -1;
		int maxRow = 0;
		int maxCol = 0;

		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				matrix[i][j] = Integer.parseInt(st.nextToken());
				if (matrix[i][j] > maxValue) {
					maxValue = matrix[i][j];
					maxRow = i;
					maxCol = j;
				}
			}
		}
		System.out.println(maxValue + "\n" +(maxRow + 1) + " " + (maxCol + 1));
	}
}
