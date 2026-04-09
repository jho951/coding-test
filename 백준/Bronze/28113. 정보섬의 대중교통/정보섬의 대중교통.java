import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || !st.hasMoreElements()) {
			String line = br.readLine();
			st = new StringTokenizer(line);
		}
		return st.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public static void main(String[] args) throws Exception {
		int arrive = nextInt();
		int bus = nextInt();
		int subway  = nextInt();
		if(arrive > subway){
			subway += arrive;
		}
		if(bus > subway){
			System.out.println("Subway");
		}else if(bus < subway){
			System.out.println("Bus");
		}else if(subway == bus){
			System.out.println("Anything");
		}
	}
}
