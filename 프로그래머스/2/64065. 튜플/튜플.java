import java.util.*;

class Solution {
    public int[] solution(String s) {
        // 1. 문자열 정리: 맨 앞의 "{{"와 맨 뒤의 "}}"를 제거합니다.
        s = s.substring(2, s.length() - 2);
        
        // 2. 집합 단위로 문자열을 쪼갭니다 (예: "},{")
        String[] sets = s.split("\\},\\{");
        
        // 3. 집합의 크기가 짧은 순서대로 정렬합니다.
        Arrays.sort(sets, (o1, o2) -> Integer.compare(o1.length(), o2.length()));
        
        List<Integer> answerList = new ArrayList<>();
        
        // 4. 각 집합을 순회하며 새로운 숫자를 리스트에 담습니다.
        for (String set : sets) {
            String[] nums = set.split(",");
            for (String num : nums) {
                int n = Integer.parseInt(num);
                // 이미 포함된 숫자가 아니라면 추가합니다.
                if (!answerList.contains(n)) {
                    answerList.add(n);
                }
            }
        }
        
        // 5. 리스트를 배열로 변환합니다.
        return answerList.stream().mapToInt(i -> i).toArray();
    }
}
