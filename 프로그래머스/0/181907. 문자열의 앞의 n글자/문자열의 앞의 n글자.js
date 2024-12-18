function solution(my_string, n) {
    var answer = '';
    answer=my_string.split('')
    answer.splice(n,my_string.length,'')
    return answer.join('');
}