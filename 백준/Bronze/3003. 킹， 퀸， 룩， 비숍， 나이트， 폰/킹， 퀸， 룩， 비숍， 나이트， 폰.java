import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		final int KING = 1;
		final int QUEEN = 1;
		final int ROOK = 2;
		final int BISHOP = 2;
		final int KNIGHT = 2;
		final int PAWN = 8;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int king = Integer.parseInt(st.nextToken());
		int queen = Integer.parseInt(st.nextToken());
		int rook = Integer.parseInt(st.nextToken());
		int bishop = Integer.parseInt(st.nextToken());
		int knight = Integer.parseInt(st.nextToken());
		int pawn = Integer.parseInt(st.nextToken());
		System.out.print(KING - king + " ");
		System.out.print(QUEEN - queen + " ");
		System.out.print(ROOK - rook + " ");
		System.out.print(BISHOP - bishop + " ");
		System.out.print(KNIGHT - knight + " ");
		System.out.print(PAWN - pawn + " ");
	}
}