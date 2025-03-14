function solution(board, range = 1) {
    let safeCount = 0;
    const n = board.length;
    
    function markDanger(x, y) {
        for (let dx = -range; dx <= range; dx++) {
            for (let dy = -range; dy <= range; dy++) {
                const nx = x + dx;
                const ny = y + dy;
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] === 0) {
                    board[nx][ny] = -1;
                }
            }
        }
    }

    for (let i = 0; i < n; i++) {
        for (let j = 0; j < n; j++) {
            if (board[i][j] === 1) {
                markDanger(i, j);
            }
        }
    }

    for (let i = 0; i < n; i++) {
        for (let j = 0; j < n; j++) {
            if (board[i][j] === 0) safeCount++;
        }
    }

    return safeCount;
}
