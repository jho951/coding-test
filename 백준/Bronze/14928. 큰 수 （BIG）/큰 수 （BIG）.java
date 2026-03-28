import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        InputStream is = System.in;
        int c;
        long result = 0;
        long mod = 20000303;
        while ((c = is.read()) <= 32) {
            if (c == -1) return;
        }
        do {
            if (c >= '0' && c <= '9') {
                result = (result * 10 + (c - '0')) % mod;
            }
        } while ((c = is.read()) > 32);

        System.out.println(result);
    }
}