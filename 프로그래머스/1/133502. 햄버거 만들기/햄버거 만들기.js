function solution(ingredient) {
  const stack = [];
  let answer = 0;

  for (const x of ingredient) {
    stack.push(x);

    if (stack.length >= 4) {
      const L = stack.length;
      if (
        stack[L - 4] === 1 && // 빵
        stack[L - 3] === 2 && // 야채
        stack[L - 2] === 3 && // 고기
        stack[L - 1] === 1    // 빵
      ) {
        stack.length = L - 4;
        answer++;
      }
    }
  }
  return answer;
}
