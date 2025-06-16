function solution(food) {
    var answer = '';
    for(let i=0; i<food.length; i++){
        if(food[i]%2!==0 && i!==0){
            food[i]=food[i]-1
        }
    }
    for(let j=1; j<food.length; j++){
        if(food[j]!==0){
           for(let z=0; z<food[j]/2; z++){
               answer+=j
           }
        }
    }
    answer+=0
    
    for(let a= answer.length; a > 0; a--){
        if(answer[a-1] !== "0"){
              answer+= answer[a-1]    
        }
    }
    return answer
}