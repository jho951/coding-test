function solution(arr, delete_list) {
    var answer = []
    return arr.filter(value => !delete_list.includes(value));
}