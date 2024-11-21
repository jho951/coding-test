function solution(numLog) {
    var answer = '';
    numLog.map((number,idx)=>{
        if(numLog[idx+1] - numLog[idx] === 1){
            answer+='w'
        }else if(numLog[idx+1] - numLog[idx]== -1){
            answer+='s'
        }else if(numLog[idx+1] - numLog[idx]== 10){
            answer+='d'
        }else if(numLog[idx+1] - numLog[idx]== -10){
            answer+='a'
        }
    })
    return answer;
}