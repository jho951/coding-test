
function dfs(numbers, target,  i, sum) {
        if (i == numbers.length) {
            return sum == target ? 1 : 0;
        }
        const usePlus  = dfs(numbers, target, i + 1, sum + numbers[i]);
        const useMinus = dfs(numbers, target, i + 1, sum - numbers[i]);
        return usePlus + useMinus;
}
    

function solution(numbers, target) {
    return dfs(numbers, target, 0, 0)
}
