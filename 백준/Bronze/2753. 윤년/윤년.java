import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        if(t % 4 ==0 && (t % 100 !=0 || t % 400 ==0)) {
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
