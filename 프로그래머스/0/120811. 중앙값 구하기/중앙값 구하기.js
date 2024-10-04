function solution(array) {
    var answer = [];
    var a= array.sort(function(a,b){return a-b})
    var b= Math.floor(a.length/2)
    
    return a[b]
}