import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while(!(line = br.readLine()).equals("0 0")) {
			String[] tokens = line.split(" ");
			int N = Integer.parseInt(tokens[0]);
			int K = Integer.parseInt(tokens[1]);
			if(K % N == 0) {
				System.out.println("factor");
			}else if(N % K == 0) {
				System.out.println("multiple");
			}else{
				System.out.println("neither");
			}
		}
	}
}
