function solution(my_string, is_prefix) {
    var answer = 0;
    if(my_string.startsWith(is_prefix)){
      if(my_string.length >= is_prefix.length){
          if(my_string.includes(is_prefix)){
              answer=1
          }
      }  
    }
    return answer;
}