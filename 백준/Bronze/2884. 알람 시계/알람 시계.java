import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer= new StringTokenizer(br.readLine());
        Integer N = Integer.parseInt(stringTokenizer.nextToken());
        Integer M = Integer.parseInt(stringTokenizer.nextToken());
        if(M < 45 && M >= 0){
            if(N == 0){
                N = 23;
            }else{
                N --;
            }
            M = 60 - 45 + M;
        }else{
            M = M - 45;
        }
        System.out.print(N+" "+ M);
    }
}
