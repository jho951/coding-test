function solution(balls, share) {
    var n=1;
    var m=1;
    var nMinusM=1;
    for(let b=1; b<=balls; b++){
        n*=b
    }
    for(let s=1; s<=share; s++){
        m*=s
    }
    for(let i=1; i<=(balls - share); i++){
       nMinusM*=i
    }
    return Math.round(n / ( nMinusM*m))
}