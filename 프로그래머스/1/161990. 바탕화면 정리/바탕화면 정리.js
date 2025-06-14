function solution(wallpaper) {
    let tempArr = [];

    for(let i= 0; i< wallpaper.length; i++) {
        for(let j= 0; j< wallpaper[i].length; j++) {
            if(wallpaper[i][j] == '#') {
                tempArr.push([i, j])
            }
        }
    }
    
    let minX = Math.min(...tempArr.map(item => item[0])); 
    let minY = Math.min(...tempArr.map(item => item[1]));
    let maxX = Math.max(...tempArr.map(item => item[0])); 
    let maxY = Math.max(...tempArr.map(item => item[1])); 

    return [minX, minY, maxX+1, maxY+1]
}