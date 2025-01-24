import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // key = 선물 가치 , value = 선물의 개수
        Map<Integer, Integer> giftMap = new HashMap<>();
        // n번 아이들 방문
        int n = scanner.nextInt();
        scanner.nextLine();
        // 행동
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            int behavior = Integer.parseInt(input[0]);
            // 아이 만남
            if (behavior == 0) {
                Integer maxGift = null;
                Object[] keys = giftMap.keySet().toArray();
                for (int j = 0; j < keys.length; j++) {
                    Integer giftValue = (Integer) keys[j];
                    if (maxGift == null || giftValue > maxGift) {
                        maxGift = giftValue;
                    }
                }
                // 선물이 있을 때
                if (maxGift != null && giftMap.get(maxGift) > 0) {
                    // 가장 좋은거
                    System.out.println(maxGift);
                    // 선물 --
                    giftMap.put(maxGift, giftMap.get(maxGift) - 1);
                    // 해당 선물 0
                    if (giftMap.get(maxGift) == 0) {
                        giftMap.remove(maxGift);
                    }
                } else {
                    // 선물 x
                    System.out.println(-1);
                }
            } else {
                // 거점지
                for (int k = 1; k <= behavior; k++) {
                    int giftValue = Integer.parseInt(input[k]);
                    // 선물 충전
                    giftMap.put(giftValue, giftMap.getOrDefault(giftValue, 0) + 1);
                }
            }
        }
    }
}
