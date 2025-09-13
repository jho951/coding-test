function solution(n) {
    var answer= 0;
    var i= String(n % 3)
    
    while (n >= 3){
       n = Math.floor(n / 3); 
        i += String(n % 3) 
    }

    for (let j= 0; j< i.length; j++){
        answer+= Number(i[j])*3**(i.length-1-j);
    }
    
    return answer
}