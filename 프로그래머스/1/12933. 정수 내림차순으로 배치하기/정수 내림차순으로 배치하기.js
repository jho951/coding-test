function solution(n) {
    var answer = [];
    var result =''
    for (let i=0; i< String(n).length; i++){
        answer.push(String(n)[i])
    }
    return Number(answer.sort((a,b)=>b-a).join(''))
}