function solution(board) {
    let min = undefined
    let [start_x,start_y] = [undefined, undefined]    

    for(let i=0; i<= board.length-1; ++i){
        for(let j= 0; j<= board[0].length-1; ++j){
            if(board[i][j] === 'R'){
                start_x = i 
                start_y = j
            }
        }
    }
    
    const visit_map = Array.from({length:board.length},(_)=>{
        return Array(board[0].length).fill(false)
    })
    
    let dx = [0,0,1,-1] , dy = [1,-1,0,0]
    let queue = [[start_x,start_y,0]]
    visit_map[start_x][start_y] = true
        
    while(queue.length){
        let [x,y,count] = queue.shift()
        if(board[x][y] === 'G'){
            min = count
            break;
        }
        dx.forEach((_,i)=> {
            // 동서남북 순
            let nx = x
            let ny = y 
            while(1){
                 nx += dx[i]
                 ny += dy[i]
                 if(!board[nx]||!board[nx][ny]||board[nx][ny]==='D'){
                     let [prev_x,prev_y] = [nx-dx[i],ny-dy[i]]
                     if(visit_map[prev_x][prev_y] === false){
                         queue.push([prev_x,prev_y,count+1])
                         visit_map[prev_x][prev_y] = true
                     }
                     
                     break;
                 }
            }
        })
    }
    return min === undefined ? -1 : min
}