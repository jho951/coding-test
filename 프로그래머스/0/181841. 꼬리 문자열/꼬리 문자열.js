function solution(str_list, ex) {
    var answer = [];
    str_list.map((item,index)=>{
        if(!item.includes(ex)){
           answer.push(item)
        }
    })
    return answer.join('');
}