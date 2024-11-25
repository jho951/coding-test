function solution(code) {
    var answer = '';
    var mode = 0;
    for(let i= 0; i< code.length; i++){
        if(code[i] === "1"){
           mode= mode === 0? 1: 0
        }else{
            if(mode === 0 && i % 2 === 0){
                answer+= code[i]
        }
            if(mode === 1 && i % 2 !== 0){
                answer+= code[i]
            }    
        }
    }
    return answer===""?"EMPTY":answer;
}