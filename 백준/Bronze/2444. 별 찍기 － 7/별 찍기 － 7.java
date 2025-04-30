import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // N 입력 받기
        int N = sc.nextInt();
        
        // 첫 번째 부분: 별이 증가하는 부분
        for (int i = 1; i <= N; i++) {
            // 공백 출력
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // 두 번째 부분: 별이 감소하는 부분
        for (int i = N - 1; i >= 1; i--) {
            // 공백 출력
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
