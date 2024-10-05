import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {0};
        ArrayList<Integer> list = new ArrayList<>();
        int[] test = Arrays.copyOf(arr, arr.length); 
        Arrays.sort(test);
        
        for (int num : arr) {
            if (num != test[0]) { 
                list.add(num);
            }
        }
        if(arr.length == 1){
            answer[0]= -1;
        }else{
             answer = list.stream().mapToInt(i -> i).toArray();
        }
        return answer;
    }
}



