function solution(num_list) {
    var answer = num_list.sort((a,b)=>b-a)
    var list;
    answer = answer.slice( num_list.length - 5 );
    list = answer.sort((a,b)=>a-b);
    return list
}