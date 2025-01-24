import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // N개 노래정보
        int N = scanner.nextInt();
        // M개 문제
        int M = scanner.nextInt();
        scanner.nextLine();

        // 키 = 첫 3개음 해당하는 값 = 노래 제목들의 리스트 
        Map<String, List<String>> firstThreeMap = new HashMap<>();

        // N개의 노래정보 반복문
        for (int i = 0; i < N; i++) {
            String note = scanner.nextLine();
            String[] parts = note.split(" ");
            
            String title = parts[1];
            String firstThree = parts[2] + " " + parts[3] + " " + parts[4];  // 첫 3음

            // 해당 첫 3음에 해당하는 노래 목록을 저장
            firstThreeMap.computeIfAbsent(firstThree, k -> new ArrayList<>()).add(title);
        }

        // M개의 시도에 대해 결과 출력
        for (int i = 0; i < M; i++) {
            String query = scanner.nextLine();  // 정환이 시도한 첫 3음
            if (firstThreeMap.containsKey(query)) {
                List<String> titles = firstThreeMap.get(query);
                if (titles.size() == 1) {
                    System.out.println(titles.get(0));  // 노래 제목 하나만 있을 때
                } else {
                    System.out.println("?");  // 여러 개의 제목이 있을 때
                }
            } else {
                System.out.println("!");  // 일치하는 노래가 없을 때
            }
        }

        scanner.close();
    }
}
