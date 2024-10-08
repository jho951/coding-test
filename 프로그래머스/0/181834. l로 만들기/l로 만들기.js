function solution(myString) {
    var answer = '';
    [...myString].map(string=>{
        if(string < 'l'){
            answer+='l'
        }else{
            answer+=string
        }
       
    }
    )
     return answer
}