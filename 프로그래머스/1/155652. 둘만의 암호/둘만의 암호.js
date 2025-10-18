/**
 * 둘만의 암호 (프로그래머스)
 * @param {string} s     - 원문
 * @param {string} skip  - 건너뛸 문자들
 * @param {number} index - 앞으로 이동할 칸 수
 * @returns {string}
 */
function solution(s, skip, index) {
  const skipSet = new Set(skip);
  // 1) skip을 제거한 '사용 가능한' 알파벳 링 만들기
  const ring = [];
  for (let i = 0; i < 26; i++) {
    const ch = String.fromCharCode(97 + i); // 'a' = 97
    if (!skipSet.has(ch)) ring.push(ch);
  }
  const L = ring.length;
  if (L === 0) return s; // 안전 가드 (이론상 발생 X)

  // 2) 각 알파벳(a~z)에 대해 “그 다음으로 오는 첫 사용가능 문자”의 ring 인덱스 미리 계산
  const nextStartIdx = new Array(26);
  const ringCodes = ring.map((ch) => ch.charCodeAt(0));
  for (let code = 97; code <= 122; code++) {
    let found = false;
    for (let i = 0; i < L; i++) {
      if (ringCodes[i] > code) {
        nextStartIdx[code - 97] = i; // ring[i]가 첫 후보
        found = true;
        break;
      }
    }
    if (!found) nextStartIdx[code - 97] = 0; // 없으면 링의 처음으로 래핑
  }

  // 3) 변환: “다음 사용가능 문자”에서 시작해 index번째를 고른다
  //    첫 후보가 1번째이므로 (index - 1)을 더해 목표 인덱스를 만든다.
  const step = ((index - 1) % L + L) % L; // 큰 수도 안전하게 모듈러
  let out = '';
  for (const ch of s) {
    const start = nextStartIdx[ch.charCodeAt(0) - 97];
    const target = ring[(start + step) % L];
    out += target;
  }
  return out;
}
