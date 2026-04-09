import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
       while (st == null || !st.hasMoreElements()) {
          String line = br.readLine();
          if (line == null) return null; // EOF 처리
          st = new StringTokenizer(line);
       }
       return st.nextToken();
    }

    static int nextInt() throws IOException {
       return Integer.parseInt(next());
    }

    public static void main(String[] args) throws Exception {
       int plus = nextInt();
       int minus = nextInt();
       
       if (plus < minus || (plus + minus) % 2 != 0) {
           System.out.println("-1");
       } else {
           int big = (plus + minus) / 2;
           int small = plus - big;
           
           StringBuilder sb = new StringBuilder();
           sb.append(big).append(' ').append(small);
           System.out.println(sb);
       }
    }
}