const solution = (s) =>
  [...s].map((str, index) => {
    const count = s.slice(0, index).lastIndexOf(str);
    return count === -1 ? count : index - count;
  });