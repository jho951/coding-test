import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String dna = sc.nextLine();
        int[] minCounts = new int[4];
        for (int i = 0; i < 4; i++) {
            minCounts[i] = sc.nextInt();
        }
        int result = 0;
        int[] count = new int[4];
        for (int i = 0; i < m; i++) {
            char c = dna.charAt(i);
            count[getIndex(c)]++;
        }
        if (isValid(count, minCounts)) {
            result++;
        }
        for (int i = m; i < n; i++) {
            char leftChar = dna.charAt(i - m);
            count[getIndex(leftChar)]--;
            char rightChar = dna.charAt(i);
            count[getIndex(rightChar)]++;
            if (isValid(count, minCounts)) {
                result++;
            }
        }
        System.out.println(result);
    }
    private static int getIndex(char c) {
        if (c == 'A') return 0;
        if (c == 'C') return 1;
        if (c == 'G') return 2;
        return 3;
    }
    private static boolean isValid(int[] count, int[] minCounts) {
        return count[0] >= minCounts[0] && count[1] >= minCounts[1] &&
               count[2] >= minCounts[2] && count[3] >= minCounts[3];
    }
}
