/**
 * 기본 템플릿
 */
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static {
		try {
			st = new StringTokenizer(br.readLine());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) throws Exception {
		BigInteger N = new BigInteger(st.nextToken());
		BigInteger K = new BigInteger(st.nextToken());
		StringBuilder sb = new StringBuilder();
		sb.append(N.divide(K)).append("\n");
		sb.append(N.remainder(K)).append("\n");
		System.out.println(sb);
	}
}