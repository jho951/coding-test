import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        for(int i = 1; i<= 9; i++){
            System.out.printf("%d * %d = %d\n", N, i, i*N);
        }
    }
}
