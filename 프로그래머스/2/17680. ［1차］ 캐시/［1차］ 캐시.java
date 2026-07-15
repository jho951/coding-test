import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> cache = new LinkedList<>();

        if (cacheSize == 0) {
            return cities.length * 5;
        }

        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase(); // 대소문자 구분 안 함

            if (cache.contains(city)) {
                // Cache Hit: 기존 위치에서 제거 후 맨 앞으로 이동, 실행시간 +1
                cache.remove(city);
                cache.addFirst(city);
                answer += 1;
            } else {
                // Cache Miss: 실행시간 +5
                if (cache.size() == cacheSize) {
                    cache.removeLast(); // 가장 오래된 데이터 제거
                }
                cache.addFirst(city);
                answer += 5;
            }
        }

        return answer;
    }
}
