function solution(order) {
    var answer = 0;
    var a= (order+"").split("");
    for(let i=0;i<a.length;i++){
        if(a[i]=="3"||a[i]=="6"||a[i]=="9"){
            answer++
        }
    }
    return answer;
}