import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args)throws IOException {
		boolean[][]paper = new boolean[100][100];
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bufferedReader.readLine());
		for (int i = 0; i < N; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int column = Integer.parseInt(stringTokenizer.nextToken());
			int row = Integer.parseInt(stringTokenizer.nextToken());
			for (int r = column; r < column + 10; r++) {
				for (int c = row; c < row + 10; c++) {
					paper[r][c] = true;
				}
			}
		}
		int area = 0;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (paper[i][j]) area++;
			}
		}
		System.out.println(area);
	}
}
