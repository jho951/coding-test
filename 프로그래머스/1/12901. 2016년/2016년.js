const MONTH = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
const DAY = ["THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"];


function solution(a, b) {
  let count = 0;
  for (let i = 1; i < a; i++) {
    count += MONTH[i - 1];
  }
    count += b; 
  return count % 7 < 0? DAY[DAY.length + (count % 7)] : DAY[count % 7]
}