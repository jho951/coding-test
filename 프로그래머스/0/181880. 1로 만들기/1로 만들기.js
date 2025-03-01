function solution(num_list) {
    var answer=0
    for(let i=0;i<num_list.length;i++){
        answer+=test(num_list[i])
    }
    return answer
}

function test(num) {
    var count=0
    while (num !== 1) {
        if (num % 2 === 0) {
            num = num / 2;
            count++
        } else {
            num = (num - 1) / 2;
              count++
        }
    }
    return count
}
