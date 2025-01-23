function solution(my_string, n) {
    var answer = ''
   answer=my_string.split('')
    answer.splice(0,my_string.length-n,'')
    return answer.join('');
}