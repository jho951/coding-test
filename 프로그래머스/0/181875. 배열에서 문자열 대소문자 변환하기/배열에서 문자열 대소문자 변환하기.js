function solution(strArr) {
    var answer = [];
    strArr.map((string,index)=>{
        if(index % 2 === 0){
          answer.push(string.toLowerCase())   
        }else if(index % 2 === 1){
        answer.push(string.toUpperCase())
    }})
    return  answer 
}