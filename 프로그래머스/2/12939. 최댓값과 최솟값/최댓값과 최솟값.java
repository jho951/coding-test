class Solution {
    public String solution(String s) {
        // 1. 공백 기준으로 문자열을 분리
        String[] parts = s.split(" ");
        
        // 2. 첫 번째 숫자를 기준으로 초기값 설정
        int min = Integer.parseInt(parts[0]);
        int max = Integer.parseInt(parts[0]);
        
        // 3. 나머지 숫자들을 순회하며 최솟값과 최댓값 갱신
        for (String part : parts) {
            int num = Integer.parseInt(part);
            if (num < min) min = num;
            if (num > max) max = num;
        }
        
        // 4. "min max" 형태로 반환
        return min + " " + max;
    }
}
