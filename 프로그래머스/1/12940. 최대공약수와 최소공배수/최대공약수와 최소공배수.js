function solution(n, m) {
    var min = Math.min(n, m);
    var max = Math.max(n, m);
    
    var gcdValue = gcd(min, max);
    var lcmValue = lcm(min, max);

    return [gcdValue, lcmValue];
}

function gcd(a, b) {
    if (b === 0) return a;
    return gcd(b, a % b);
}

function lcm(a, b) {
    return (a * b) / gcd(a, b);
}