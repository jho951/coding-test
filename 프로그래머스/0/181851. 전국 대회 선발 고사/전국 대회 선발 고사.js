function solution(rank, attendance) {
  // [등수, 학생번호] 형태로 참석 가능한 학생만 모으기
  const candidates = [];
  for (let i = 0; i < rank.length; i++) {
    if (attendance[i]) candidates.push([rank[i], i]);
  }

  // 등수 오름차순 정렬
  candidates.sort((a, b) => a[0] - b[0]);

  // 상위 3명 학생 번호
  const a = candidates[0][1];
  const b = candidates[1][1];
  const c = candidates[2][1];

  return 10000 * a + 100 * b + c;
}
