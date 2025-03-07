import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer= new StringTokenizer(input.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());
        StringTokenizer number= new StringTokenizer(input.readLine());
        int T = Integer.parseInt(number.nextToken());
        if((K + T) / 60 > 0){
           N = N + (K + T) / 60;
        }
        if(N >= 24){
            N = N - 24;
        }
        K = (K + T) % 60;
        System.out.println(N + " " + K);
    }
}
