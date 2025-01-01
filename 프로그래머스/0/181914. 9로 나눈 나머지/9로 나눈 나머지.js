function solution(number) {
    var answer = 0;
    for(let i=0;i< String(number).length; i++){
        answer+=Number( String(number)[i])
    }
    return answer % 9;
}