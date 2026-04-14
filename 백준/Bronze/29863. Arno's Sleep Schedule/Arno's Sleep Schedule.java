import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sleep = sc.nextInt();
        int wake = sc.nextInt();
        
        if (sleep > 10) {
            System.out.println(24 - sleep + wake);
        } else {
            System.out.println(wake - sleep);
        }
    }
}