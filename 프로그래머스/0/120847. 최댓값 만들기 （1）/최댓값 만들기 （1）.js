function solution(numbers) {
    var maxNum = numbers.sort(function(a, b){return b - a});
    return  maxNum[0] * maxNum[1];
}