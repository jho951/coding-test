import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
      ArrayList<Integer> indexesOfTwo = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                indexesOfTwo.add(i);
            }
        }
        // 2가 없을 때 
        if (indexesOfTwo.isEmpty()) {
            return new int[]{-1};
        }
        // 2가 하나일 때
        if (indexesOfTwo.size() == 1) {
            return new int[]{arr[indexesOfTwo.get(0)]};
        }
        // 2가 복수 개 일 때
        int firstIndex = indexesOfTwo.get(0);
        int lastIndex = indexesOfTwo.get(indexesOfTwo.size() - 1);

        int length = lastIndex - firstIndex + 1;

        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            answer[i] = arr[firstIndex + i];
        }
        return answer;
    }
}