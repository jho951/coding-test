function solution(k, score) {
    var answer = [];
    var list =[];
    for(let i = 0; i< score.length; i++){
        console.log(i)
        if(list[0] > score[i] && list.length >= k) {
            answer.push(list[0])
            continue;
        }
        if(list.length >= k){
            list.shift();
            list.push(score[i]);
        }else{
            list.push(score[i]);
        }
        list.sort((a, b)=> a-b)
        answer.push(list[0])
    }
    return answer;
}