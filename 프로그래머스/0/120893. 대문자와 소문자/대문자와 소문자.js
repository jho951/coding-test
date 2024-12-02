function solution(my_string) {
    var answer = my_string.replace(/./g, str =>
      str === str.toUpperCase() ? str.toLowerCase() : str.toUpperCase()
  );
    return answer;
}