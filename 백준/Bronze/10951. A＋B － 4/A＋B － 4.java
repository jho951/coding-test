import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = br.readLine()) != null) {
            String[] tokens = line.split(" ");
            int A = Integer.parseInt(tokens[0]);
            int B = Integer.parseInt(tokens[1]);
            System.out.println(A + B);
        }
    }
}
