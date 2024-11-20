function solution(a, b, c, d) {
    // 주사위 숫자를 배열로 정리하고, 각 숫자의 빈도를 계산합니다.
    const dice = [a, b, c, d];
    const countMap = {};
    
    dice.forEach(num => {
        countMap[num] = (countMap[num] || 0) + 1;
    });

    // 빈도를 기준으로 숫자를 분류합니다.
    const keys = Object.keys(countMap).map(Number);
    const counts = Object.values(countMap);

    if (keys.length === 1) {
        // 네 주사위 숫자가 모두 같음
        const p = keys[0];
        return 1111 * p;
    } else if (keys.length === 2) {
        if (counts.includes(3)) {
            // 세 주사위 숫자가 같고 하나는 다름
            const p = keys[counts.indexOf(3)];
            const q = keys[counts.indexOf(1)];
            return Math.pow(10 * p + q, 2);
        } else {
            // 두 개씩 같은 숫자가 나옴
            const [p, q] = keys;
            return (p + q) * Math.abs(p - q);
        }
    } else if (keys.length === 3) {
        // 두 개는 같고 나머지 두 개는 서로 다름
        const p = keys[counts.indexOf(2)];
        const [q, r] = keys.filter(k => k !== p);
        return q * r;
    } else {
        // 네 주사위 숫자가 모두 다름
        return Math.min(...dice);
    }
}