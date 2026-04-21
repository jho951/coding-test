import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int n = elements.length;
        
        int[] extended = new int[n * 2];
        
        for(int i = 0; i < n; i++) {
            extended[i] = extended[i + n] = elements[i];
        }
        
        for(int i = 1; i <= n; i++) {
            int sum = 0;
            for(int j = 0; j<n; j++) {
                if(j == 0) {
                    for(int k = 0; k < i; k++) sum += extended[k];
                } else {
                    sum = sum - extended[j - 1] + extended[j + i - 1];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}
