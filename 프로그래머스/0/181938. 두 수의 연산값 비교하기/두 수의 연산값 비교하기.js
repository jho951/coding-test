function solution(a, b) {
    var answer = 0;
    var option1= 2*a*b;
    var option2= Number(String(a)+String(b))
    if(option1>option2){
        answer=option1
    }else{
        answer=option2
    }
    return answer;
}