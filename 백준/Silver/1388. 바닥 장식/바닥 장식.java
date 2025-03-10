import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        char[][] floor = new char[N][M];
        for (int i = 0; i < N; i++) {
            floor[i] = sc.nextLine().toCharArray();
        }

        int count = 0;

        for (int i = 0; i < N; i++) {
            boolean inBoard = false;
            for (int j = 0; j < M; j++) {
                if (floor[i][j] == '-') {
                    if (!inBoard) {
                        count++;
                        inBoard = true;
                    }
                } else {
                    inBoard = false;
                }
            }
        }
        for (int j = 0; j < M; j++) {
            boolean inBoard = false;
            for (int i = 0; i < N; i++) {
                if (floor[i][j] == '|') {
                    if (!inBoard) {
                        count++;
                        inBoard = true;
                    }
                } else {
                    inBoard = false;
                }
            }
        }
        System.out.println(count);
    }
}
