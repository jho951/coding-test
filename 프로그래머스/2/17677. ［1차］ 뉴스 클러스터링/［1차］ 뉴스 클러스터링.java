import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        // 1. 대소문자 구분을 없애기 위해 모두 소문자로 변환
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        // 2. 각 문자열의 다중집합을 빈도수 맵(HashMap)으로 생성
        Map<String, Integer> map1 = makeMultiSet(str1);
        Map<String, Integer> map2 = makeMultiSet(str2);
        
        // 3. 두 집합이 모두 공집합인 경우 예외 처리
        if (map1.isEmpty() && map2.isEmpty()) {
            return 65536;
        }
        
        int intersectionSum = 0;
        int unionSum = 0;
        
        // 4. 교집합 및 합집합의 원소 수 계산
        // 모든 등장 원소를 중복 없이 모으기 위해 Set 사용
        Set<String> allKeys = new HashSet<>();
        allKeys.addAll(map1.keySet());
        allKeys.addAll(map2.keySet());
        
        for (String key : allKeys) {
            int count1 = map1.getOrDefault(key, 0);
            int count2 = map2.getOrDefault(key, 0);
            
            // 다중집합 교집합: 두 빈도 중 작은 값
            intersectionSum += Math.min(count1, count2);
            // 다중집합 합집합: 두 빈도 중 큰 값
            unionSum += Math.max(count1, count2);
        }
        
        // 5. 자카드 유사도 계산 후 조건에 맞춰 리턴
        double jaccard = (double) intersectionSum / unionSum;
        return (int) (jaccard * 65536);
    }
    
    // 2글자씩 끊어서 영문자로만 구성된 다중집합(Map)을 만드는 헬퍼 메소드
    private Map<String, Integer> makeMultiSet(String str) {
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < str.length() - 1; i++) {
            char first = str.charAt(i);
            char second = str.charAt(i + 1);
            
            // 두 글자 모두 영문 소문자인 경우에만 유효한 원소로 인정
            if (first >= 'a' && first <= 'z' && second >= 'a' && second <= 'z') {
                String word = "" + first + second;
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        return map;
    }
}
