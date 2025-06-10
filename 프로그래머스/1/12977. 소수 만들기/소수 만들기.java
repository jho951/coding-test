import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i< nums.length; i++){

            for(int j = i + 1; j< nums.length; j++){
                for(int k = j + 1; k< nums.length; k++){
                    int temp = nums[i] + nums[j] + nums[k];
                    int count = 0;
                    for(int z = 2; z < temp; z++){
                        if(temp % z == 0){
                           count ++;
                           break;
                        }
                    }
                    if(count == 0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
