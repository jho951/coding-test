function solution(sides) {
    var answer = 1;
    var triangle= sides.sort(function(a,b){return a-b})
    if(triangle[2] >= triangle[1] + triangle[0]){answer = 2}
    return answer;
}