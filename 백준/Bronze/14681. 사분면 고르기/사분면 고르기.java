import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        if(N > 0 ){
            if(K > 0){
                System.out.println(1);
            }else{
                System.out.println(4);
            }
        }else{
            if(K > 0){
                System.out.println(2);
            }else{
                System.out.println(3);
            }
        }
    }
}
