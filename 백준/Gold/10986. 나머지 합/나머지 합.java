import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        long ee = 0;
        long[] modCount = new long[M];
        modCount[0] = 1;
        long result = 0;
        for (int i = 0; i < N; i++) {
            ee += A[i];
            int mod = (int) (ee % M);
            if (mod < 0) {
                mod += M;
            }
            result += modCount[mod];
            modCount[mod]++;
        }
        System.out.println(result);
    }
}
