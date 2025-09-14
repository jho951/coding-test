class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }
    
    private int dfs(int[] numbers, int target, int i, int sum) {
        if (i == numbers.length) {
            return sum == target ? 1 : 0;
        }
        int usePlus  = dfs(numbers, target, i + 1, sum + numbers[i]);
        int useMinus = dfs(numbers, target, i + 1, sum - numbers[i]);
        return usePlus + useMinus;
    }
}