import java.util.*;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        int len = message.length();
        boolean[] isSpoilerIdx = new boolean[len];
        
        // 1. 스포 방지 구간의 인덱스 마킹
        for (int[] range : spoiler_ranges) {
            int start = range[0];
            int end = range[1];
            for (int i = start; i <= end; i++) {
                isSpoilerIdx[i] = true;
            }
        }
        
        // 공백(띄어쓰기)을 기준으로 메시지를 단어로 분리
        String[] words = message.split(" ");
        Set<String> spoilerWords = new HashSet<>();
        Set<String> noSpoilerWords = new HashSet<>();
        
        int currentIdx = 0;
        
        // 2. 각 단어가 스포 방지 구간에 포함되는지 체크
        for (String word : words) {
            boolean isPartialSpoiler = false;
            
            for (int i = 0; i < word.length(); i++) {
                if (isSpoilerIdx[currentIdx + i]) {
                    isPartialSpoiler = true;
                    break;
                }
            }
            
            if (isPartialSpoiler) {
                spoilerWords.add(word);
            } else {
                noSpoilerWords.add(word);
            }
            
            // 다음 단어를 위해 인덱스 이동 (+1은 공백 문자)
            currentIdx += word.length() + 1;
        }
        
        // 3. 중요한 단어 조건 필터링
        Set<String> importantWords = new HashSet<>();
        for (String word : spoilerWords) {
            // 스포 방지 단어가 아니거나 일반 구간에 등장한 적이 없는 경우
            if (!noSpoilerWords.contains(word)) {
                importantWords.add(word);
            }
        }
        
        return importantWords.size();
    }
}
