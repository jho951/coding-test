import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        while (N-- > 0) {
            int x = input.nextInt();
            result.add(x);
        }
        Collections.sort(result);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}