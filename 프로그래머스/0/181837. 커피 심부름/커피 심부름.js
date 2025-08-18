function solution(order) {
    var answer = 0;
    order.map((list)=>{
        if(list.includes('americano')){
            answer+=4500
        }else if(list.includes('cafelatte')){
            answer+=5000
        }else{
            answer+=4500
        }
    })
    return answer;
}