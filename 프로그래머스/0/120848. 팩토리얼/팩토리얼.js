function solution(n) {
  var fac = 1;
    var i = 1;

    while (fac < n) { 
        fac *= i; 
        if(fac* i+1 <= n){
          i++;   
        } 
    }
    return i
}