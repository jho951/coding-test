function solution(quiz) {
    var answer = [];
    for(let i = 0; i< quiz.length; i++){
        var calculateSentence = quiz[i].split(" ")
        var result = Number(calculateSentence[0]);
        for(let j = 1; j< calculateSentence.length; j++ ){
            if(calculateSentence[j] === "+"){
               result += Number(calculateSentence[j+1])
            }else if(calculateSentence[j] === "-"){
               result -= Number(calculateSentence[j+1])    
            }else if(calculateSentence[j] === "="){
                if(result === Number(calculateSentence[j+1])){
                    answer.push('O')
                }else{
                    answer.push('X')
                }
            }
        }
    }
    return answer
}