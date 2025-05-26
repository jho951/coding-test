function solution(seoul){
  var result = 0;
  for(let i = 0; i<seoul.length; i++) {
    if(seoul[i] == "Kim") {
        seoul.length=i;
    }
  }
  return "김서방은 " + seoul.length+ "에 있다";
}