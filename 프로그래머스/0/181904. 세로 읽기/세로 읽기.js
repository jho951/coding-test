function solution(my_string, m, c) {
    var answer = []
    var result = ""
    for(let i = 0; i< my_string.length; i+=m){
        answer.push(my_string.slice(i, i + m))
    }  
    result+=answer.map(i=>i[c - 1]);
    return result.replace(/,/g, "");
}