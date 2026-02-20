import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 상의 N개에 대해, 자신과 다른 색의 하의 N-1개를 매치
        System.out.println(n * (n - 1));
        sc.close();
    }
}