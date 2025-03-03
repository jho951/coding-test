import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer= new StringTokenizer(in.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());
        if(N < K){
            System.out.println("<");
        } else if (N > K) {
            System.out.println(">");
        }else{
            System.out.println("==");
        }
    }
}
