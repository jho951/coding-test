function solution(names) {
    var answer = [];
    names.map((i,index)=>{
        if(index%5===0){
            answer.push(i)
        }
    })
    return answer;
}