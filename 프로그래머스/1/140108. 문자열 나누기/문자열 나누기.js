function solution(s) {
    let count = 0;
    let i = 0;

    while (i < s.length) {
        let x = s[i];
        let countX = 0;
        let countOther = 0;
        while (i < s.length) {
            if (s[i] === x) countX++;
            else countOther++;
            i++;
            if (countX === countOther) {
                count++;
                break;
            }
        }
        if (countX !== countOther) count++;
    }
    return count;
}
