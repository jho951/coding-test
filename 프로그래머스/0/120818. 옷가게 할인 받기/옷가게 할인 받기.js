function solution(price) {
    var answer = 0;
     if(price >= 500000){
         answer=Math.floor(price*4/5)
    }else if(price >= 300000){
        answer=Math.floor(price*9/10)
    }else if(price >= 100000){
        answer= Math.floor(price*19/20)
    }else if (price < 100000){
        answer=Math.floor(price)
    }
    return answer;
}