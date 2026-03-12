import java.io.*;
import java.util.*;

public class Main { 
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        // 1. 입력 받기
        String input = br.readLine();
        
        // 2. 중복을 제거하며 저장할 Set 선언
        Set<String> set = new HashSet<>();

        // 3. 모든 부분 문자열 찾기 (이중 반복문)
        // i는 시작점, j는 끝점
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                // substring(i, j)는 i인덱스부터 j-1인덱스까지 자름
                set.add(input.substring(i, j));
            }
        }

        // 4. Set의 크기가 곧 서로 다른 부분 문자열의 개수
        System.out.println(set.size());
    }
}