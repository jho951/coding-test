import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            String str = br.readLine();
           
            if(str == null || str.equals("#")) break;
            
            int answer = 0;
            for(char c : str.toCharArray()) {
                char lowerC = Character.toLowerCase(c);
                if(lowerC == 'a' || lowerC == 'e' || lowerC == 'i'|| lowerC == 'o' || lowerC == 'u'){
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }
}
