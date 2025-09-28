function solution(myString) {
    var answer=[]
   myString.split('x').filter(item=>{
        if(item!=='') {
            answer.push(item)
            }
        })                    
    return answer.sort()
    
}