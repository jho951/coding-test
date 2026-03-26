import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int minResult = (n + 1) * 2;
            int maxResult = (n + 1) * 3;
            System.out.print(minResult + " " + maxResult);
        }
        sc.close();
    }
}