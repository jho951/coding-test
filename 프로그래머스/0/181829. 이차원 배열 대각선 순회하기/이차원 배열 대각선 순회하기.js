function solution(board, k) {
    var answer='';
    var result=0
    answer= board.map((item,idxd)=>item.filter((items,idx)=>idxd+idx<=k)).flat()
    for(let i=0; i<answer.length;i++){
        result+=Number(answer[i])
    }
    return result
}