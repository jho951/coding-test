import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lambda = sc.nextInt(); // 파장 입력

        // 파장 범위에 따라 색상 출력
        if (lambda >= 620 && lambda <= 780) {
            System.out.println("Red");
        } else if (lambda >= 590) {
            System.out.println("Orange");
        } else if (lambda >= 570) {
            System.out.println("Yellow");
        } else if (lambda >= 495) {
            System.out.println("Green");
        } else if (lambda >= 450) {
            System.out.println("Blue");
        } else if (lambda >= 425) {
            System.out.println("Indigo");
        } else if (lambda >= 380) {
            System.out.println("Violet");
        }
        
        sc.close();
    }
}
