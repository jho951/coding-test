function solution(k, m, score) {
    score.sort((a,b)=> b-a);
    var perNum = parseInt(score.length / m);
    var listNum = [];
    var answer = 0;
    score.filter((i,idx)=>{
        if( Number.isInteger((idx + 1)/m)){
            listNum.push(i)
        }
    })
    for(let i = 0; i< listNum.length; i++){
      answer+= m * listNum[i] 
    }
    return answer;
}