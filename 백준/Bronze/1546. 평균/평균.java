import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if (N > 1000) {
            throw new ArithmeticException();
        }
        int[] A = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = input.nextInt();
        }
        long sum = 0;
        long max = 0;
        for(int i = 0; i < N; i++) {
            if(A[i] > max) max = A[i];
            sum += A[i];
        }
        System.out.print(sum*100.0 / max / N);
    }
}
