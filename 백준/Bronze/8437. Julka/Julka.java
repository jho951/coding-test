import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        BigInteger total = new BigInteger(br.readLine());
        BigInteger diff = new BigInteger(br.readLine()); 
        BigInteger two = new BigInteger("2");
        BigInteger x = total.add(diff).divide(two);
        BigInteger y = total.subtract(diff).divide(two);

        System.out.println(x);
        System.out.println(y);
    }
}