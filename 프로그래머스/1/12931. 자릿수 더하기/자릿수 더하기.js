function solution(N){
    var answer = 0;
    
    for(let i = 0; i< String(N).length; i++){
        answer += Number( String(N)[i]);
    }
    return answer
  
}