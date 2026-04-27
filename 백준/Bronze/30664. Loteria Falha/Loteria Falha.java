import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 42로 나누어떨어지는지 확인하기 위한 BigInteger 상수
        BigInteger divisor = new BigInteger("42");

        while (sc.hasNext()) {
            String input = sc.next();
            
            // 입력이 "0"이면 종료
            if (input.equals("0")) {
                break;
            }

            // 문자열로 받은 큰 수를 BigInteger로 변환
            BigInteger n = new BigInteger(input);

            // n % 42 == 0 인지 확인
            if (n.remainder(divisor).equals(BigInteger.ZERO)) {
                System.out.println("PREMIADO");
            } else {
                System.out.println("TENTE NOVAMENTE");
            }
        }
        sc.close();
    }
}
