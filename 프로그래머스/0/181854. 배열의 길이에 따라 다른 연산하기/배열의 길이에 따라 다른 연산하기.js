function solution(arr, n) {
    var answer = [];
    arr.map((item,index)=>{
        if( arr.length % 2 === 0 ){
            if( index % 2 === 1 ){
                answer.push(item + n)
            }else{
                answer.push(item)
            }
        }else if( arr.length % 2 === 1 ){
            if( index % 2 === 0 ){
                answer.push(item + n)
            }else{
                answer.push(item)
            }
        }
    })
    return answer;
}