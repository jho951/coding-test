import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int T = 1;
		int N = 0;
		int I = 0;
		while(T <= 9){
			int number = Integer.parseInt(bufferedReader.readLine());
			if(N < number){
				N = number;
				I = T;
			}
			T++;
		}
		System.out.println(N);
		System.out.println(I);
	}
}
