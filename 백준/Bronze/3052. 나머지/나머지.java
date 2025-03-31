import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<Integer> arr = new HashSet<>();
		for(int i = 0; i< 10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr.add(Integer.parseInt(st.nextToken())%42);
		}
		System.out.println(arr.size());
	}
}
