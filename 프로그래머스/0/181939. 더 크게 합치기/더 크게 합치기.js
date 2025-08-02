function solution(a, b) {
    var answer = 0;
    if(Number(String(a)+String(b)) > Number(String(b)+String(a)) ){
        answer=Number(String(a)+String(b))
    }else{
        answer=Number(String(b)+String(a))
    }
    return answer
}