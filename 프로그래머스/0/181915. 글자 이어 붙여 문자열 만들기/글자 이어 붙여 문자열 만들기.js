function solution(my_string, index_list) {
    var answer = '';
    index_list.map(stringOrder=>answer+=my_string[stringOrder])
    return answer;
}