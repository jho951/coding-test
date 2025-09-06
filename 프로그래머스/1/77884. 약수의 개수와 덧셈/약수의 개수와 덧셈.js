function solution(left, right) {
    var answer = 0;
    for (let j=left; j<= right; j++){
        var count=1;
        for(let i=1; i< j; i++){
            if(j% i===0){
                count++
            }
        }
        if(count %2===0){
            answer+=j
        }else{
            answer-=j
        }
    }
  
    return answer;
}