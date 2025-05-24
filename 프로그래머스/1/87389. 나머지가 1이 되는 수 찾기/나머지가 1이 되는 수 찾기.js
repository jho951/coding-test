function solution(n) {
    var answer = [];
    for( let i = 0; i< n; i++){
        if((n - 1) % i === 0){
          answer.push(i);
        }
    }
    return answer[1];
}