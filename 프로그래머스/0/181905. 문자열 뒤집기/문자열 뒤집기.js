function solution(my_string, s, e) {
    var targetString=my_string.slice(s,e+1)
    var reverseString= targetString.split('').reverse().join('')
    return my_string.replace(targetString,reverseString)
}