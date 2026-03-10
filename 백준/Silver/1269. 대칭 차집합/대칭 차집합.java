import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }
    static int nextInt() throws IOException { return Integer.parseInt(next()); }

    public static void main(String[] args) throws Exception {
        int nA = nextInt();
        int nB = nextInt();

        // 1. HashSet에 집합 A의 원소를 모두 담습니다.
        Set<Integer> setA = new HashSet<>();
        for (int i = 0; i < nA; i++) {
            setA.add(nextInt());
        }

        // 2. 집합 B를 입력받으면서 처리합니다.
        int commonCount = 0;
        for (int i = 0; i < nB; i++) {
            int numB = nextInt();
            // 집합 A에 이미 있는 숫자라면 '교집합'입니다.
            if (setA.contains(numB)) {
                commonCount++;
            }
        }

        // 3. 대칭 차집합의 원소 개수 공식:
        // (A의 개수 - 교집합 개수) + (B의 개수 - 교집합 개수)
        int result = (nA - commonCount) + (nB - commonCount);
        System.out.println(result);
    }
}