function solution(my_string, indices) {
return my_string.split('').filter((_,idx) => !indices.includes(idx)).join('')
}