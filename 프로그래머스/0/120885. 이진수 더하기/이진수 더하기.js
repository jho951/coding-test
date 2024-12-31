function solution(bin1, bin2) {
    var b = 0;
    var a=0;
    var answer=0
    var bin1Reverse = bin1.split("").reverse();
    var bin2Reverse = bin2.split("").reverse();
    for(let i=0; i<bin1.length;i++){
       if(bin1Reverse[i]==1){
           a+=2**i
       } 
    }
    for(let j=0;j<bin2.length;j++){
           if(bin2Reverse[j]==1){
            b+=2**j  
       }
    }
    answer=a+b
    return answer.toString(2)
}

//   var a= (Number(bin1)+Number(bin2))
//     for(let i=0;i<a.length;i++){
//          if(a[i]==2){
//              return a.replace('2','10')
//          }
//     // }