function solution(money) {
    var answer = [0,0];
    answer[0]= Math.floor(money/5500);
    answer[1]= Math.floor(money%5500);
    
    return answer;
}