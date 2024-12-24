import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = num1; i< num2 + 1; i++){
            answer.add(numbers[i]);
        }
        int[] result = new int[answer.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}