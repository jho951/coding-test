function solution(s){
    var compare=s.toLowerCase()
    return compare.split('p').length === compare.split('y').length ? true : false
}