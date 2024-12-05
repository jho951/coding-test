import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<Integer> solution(int n, int[] numlist) {
        List<Integer> result = new ArrayList<>();
        for (int num : numlist) {
            result.add(num);
        }
        result.removeIf(i -> i % n != 0);

        return result;
    }
}

