function solution(n) {
    var answer = [];
    for(let i = String(n).split('').length - 1; i >= 0; i--){
        answer.push(Number(String(n).split('')[i]))
    }
    return answer
}