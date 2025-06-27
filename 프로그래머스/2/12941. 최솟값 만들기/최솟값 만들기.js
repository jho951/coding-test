function solution(A,B){
    var answer = 0;
    B.sort((a,b)=> b - a);
    A.sort((a,b)=> a - b);
    for(let i = 0; i< A.length; i++){
        answer+= A[i]*B[i];
    }
    return answer;
}