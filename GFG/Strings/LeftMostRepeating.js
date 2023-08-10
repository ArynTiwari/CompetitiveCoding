/**
 *
 * @param {string} s
 */
const leftMost = (s) => {
  let n = s.length;
  let charArr = new Array(n);
  charArr.fill(false);
  let res = -1;
  for (let i = n - 1; i >= 0; i--) {
    if (charArr[s.charAt(i)]) {
      res = i;
    } else {
      charArr[s.charAt(i)] = true;
    }
  }
  return res;
};
let ans = leftMost("geeksforgeeks");
console.log(ans);
