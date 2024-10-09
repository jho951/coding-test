function solution(my_string) {
    var answer = 0;
    var a = my_string.match(/[0-9]/g);
    for(let i=0;i<a.length;i++){
        answer+=Number(a[i])
    }
    return answer;
}