import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // 1. n을 읽을 때 굳이 StringTokenizer 안 써도 됩니다. (한 줄에 하나만 들어오니까요)
        int n = Integer.parseInt(reader.readLine()); 

        int Quarter = 25;
        int Dime = 10;
        int Nickel = 5;
        int Penny = 1;

        while (n-- > 0) {
            // 2. 중요! 매 테스트 케이스마다 배열을 새로 만들거나 0으로 초기화해야 합니다.
            int[] answer = new int[4]; 
            
            int a = Integer.parseInt(reader.readLine());
            
            // 3. 기존 if-else if 로직 유지 (순서대로 깎아 내려가기)
            if (a >= Quarter) {
                answer[0] = a / Quarter;
                a %= Quarter;
            }
            if (a >= Dime) { // else if 대신 if를 써야 차례대로 다 검사합니다.
                answer[1] = a / Dime;
                a %= Dime;
            }
            if (a >= Nickel) {
                answer[2] = a / Nickel;
                a %= Nickel;
            }
            if (a >= Penny) {
                answer[3] = a / Penny;
                a %= Penny;
            }

            // 4. 중요! 한 케이스가 끝날 때마다 바로 출력해야 합니다.
            String result = Arrays.stream(answer)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
            System.out.println(result);
        }
    }
}