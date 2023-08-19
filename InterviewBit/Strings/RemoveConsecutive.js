/**
 * @param {string} A
 */
solve = function (A, B) {
  let result = "";
  let count = 1;

  for (let i = 0; i < A.length; i++) {
    if (i < A.length - 1 && A[i] === A[i + 1]) {
      count++;
    } else {
      if (count !== B) {
        result += A[i].repeat(count);
      }
      count = 1;
    }
  }

  return result;
};
console.log(solve("abcdefg", 1));
