function solution(num_list) {
    var answer = 0;
    var minus=num_list.filter(item=>item < 0)
    answer=num_list.indexOf(minus[0])
    return answer;
}