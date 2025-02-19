import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt(); 
        String num = input.next();

        int result = 0;
        for (int i = 0; i < N; i++) {
            result += num.charAt(i) - '0'; 
        }

        System.out.println(result);

        input.close();
    }
}
