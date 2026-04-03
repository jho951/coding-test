import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalBottles = 0;
        
        for (int i = 0; i < 6; i++) {
            totalBottles += sc.nextInt();
        }
        
        System.out.println(totalBottles * 5);
    }
}
