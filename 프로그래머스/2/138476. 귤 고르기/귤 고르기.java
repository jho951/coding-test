import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int sum = 0; 
        int typeCount = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < tangerine.length; i++){
            map.merge(tangerine[i], 1, (oldValue, newValue) -> oldValue + 1);
        }
        
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        

        for(int j = 0; j < list.size(); j++){
            sum += list.get(j);
            typeCount++;
            
            if(sum >= k) { 
                return typeCount;
            }
        }
        return typeCount;
    }
}
