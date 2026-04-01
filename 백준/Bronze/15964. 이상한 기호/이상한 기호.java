import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line = br.readLine();
            if (line == null) return;

            StringTokenizer st = new StringTokenizer(line);
            long N = Long.parseLong(st.nextToken());
            long M = Long.parseLong(st.nextToken());
            System.out.println((N + M) * (N - M));
        }
    }
}