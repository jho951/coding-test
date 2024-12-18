function solution(arr) {
    var answer = [...arr]
    var l = 0;
    while (2 ** l < answer.length) {
        l++;
    }
    while( 2**l - answer.length > 0){
        answer.push(0)
    }

    return answer
}

