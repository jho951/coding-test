function solution(num_list) {
    var answer = [];
    var j = num_list.length
     for(let i = 1; i< j + 1; i++){
       answer.push(num_list[j-i]);
        }
    return answer;
}