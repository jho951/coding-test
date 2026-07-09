import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // 1. 옷의 종류별 개수 세기
        for (String[] cloth : clothes) {
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        
        int answer = 1;
        
        // 2. 조합의 수 계산: (옷 개수 + 1)을 곱함
        for (int count : map.values()) {
            answer *= (count + 1);
        }
        
        // 3. 아무것도 입지 않는 경우 1 빼기
        return answer - 1;
    }
}
