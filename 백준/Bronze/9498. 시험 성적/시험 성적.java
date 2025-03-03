import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer= new StringTokenizer(in.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        if( N >= 90 && N <= 100) {
            System.out.println("A");
        }else if(N >= 80 && N < 90) {
            System.out.println("B");
        }else if(N >= 70 && N < 80) {
            System.out.println("C");
        }else if(N >= 60 && N < 70) {
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}
