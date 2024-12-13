// function solution(numer1, denom1, numer2, denom2) {
//     var answer = [0,0];
//     var Gcd = findGcd(denom1, denom2)
//     answer[0] = (numer1 * denom2 + numer2 * denom1) / Gcd;
//     answer[1] = denom1 * denom2 / Gcd;
//     return answer; 
// }

// function findGcd(a, b) {
// 	const remainder = a % b
//     if (remainder === 0)
//         return b
//     return findGcd(b, remainder);
// }


function solution(numer1, denom1, numer2, denom2) {
    let numer = numer1 * denom2 + numer2 * denom1;
    let denom = denom1 * denom2;

    let gcd = gcdFunction(numer, denom);

    numer /= gcd;
    denom /= gcd;

    return [numer, denom];
}

function gcdFunction(a, b) {
    while (b !== 0) {
        let temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
