import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] numArr = new int[N];
        for (int i = 0; i < N; i++) {
            numArr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(numArr);
        int T = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer2 = new StringTokenizer(bufferedReader.readLine());
        int[] numArr2 = new int[T];
        for (int i = 0; i < T; i++) {
            numArr2[i] = Integer.parseInt(stringTokenizer2.nextToken());
        }
        for (int i = 0; i < T; i++) {
            boolean flag = false;
            int start = 0;
            int end = numArr.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                int midV = numArr[mid];
                if (midV > numArr2[i]) {
                    end = mid - 1;
                } else if (midV < numArr2[i]) {
                    start = mid + 1;
                } else {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
