import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] list = new int[30];
		for(int i = 0; i< 28; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			list[a - 1] += 1;
		}
		for(int i = 0; i < list.length; i++){
			if(list[i] == 0){
				System.out.println(i + 1);
			}
		}
	}
}
