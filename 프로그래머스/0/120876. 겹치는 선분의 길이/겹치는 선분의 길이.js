function solution(lines) {
    let min = Math.min(...lines.flat());
    let max = Math.max(...lines.flat());
    let arr = Array(max - min + 1).fill(0);

    for (let line of lines) {
        line.sort((a, b)=> a-b);
        if (min < 0) {
            line[0] += Math.abs(min)
            line[1] += Math.abs(min)
        }
        for (let i = line[0]; i < line[1]; i++) arr[i]++;
    }
 
    return arr.filter(v => v > 1).length;

}
