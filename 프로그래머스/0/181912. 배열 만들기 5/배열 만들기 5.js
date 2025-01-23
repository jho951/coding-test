function solution(intStrs, k, s, l) { 
 return intStrs.filter(v => (Number(v.slice(s, s+l)) > k)).map(item=>Number(item.slice(s,s+l)))
}