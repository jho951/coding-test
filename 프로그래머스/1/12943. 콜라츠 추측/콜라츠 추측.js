function solution(num) {
    if(num === 1){
        return 0;
    }
    for(let i = 1; num !== 1;i++) {
        if(i === 500){
            return -1;
    }

    if(num % 2 === 0){
        num /= 2;
    }else{
        num = (num*3) + 1;
    }

    if(num === 1){
          return i;
      }  
    } 
}