import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 처음 입력받은 수
        int copy = N;         // 변하는 수를 저장할 변수
        int count = 0;        // 사이클 횟수

        while (true) {
            // 1. 각 자리수를 더함: (십의 자리 + 일의 자리)
            // 2. 새로운 수 생성: (기존 일의 자리 * 10) + (더한 값의 일의 자리)
            copy = ((copy % 10) * 10) + (((copy / 10) + (copy % 10)) % 10);
            
            count++;

            // 처음 입력한 수와 같아지면 종료
            if (N == copy) {
                break;
            }
        }
        
        System.out.println(count);
    }
}
