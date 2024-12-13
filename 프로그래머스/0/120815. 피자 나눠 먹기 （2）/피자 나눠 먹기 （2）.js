function solution(n) {
    var answer = 0;
    let lcm = 1; 
    while(true){
      if((lcm % n == 0) && (lcm % 6 == 0)){
        break;
      }
      lcm++;
    }
  	return answer=lcm/6
 
}