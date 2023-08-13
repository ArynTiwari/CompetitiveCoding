/**
 * @param {Array} a
 */
const a = [-6, -3, -1, 2, 4, 5];

const sortArrayWithSquare = (a) => {
  let n = a.length;
  let res = new Array(n);
  let index = n - 1;
  let l = 0,
    r = n - 1;
  while (l <= r) {
    let x = Math.abs(a[l]);
    let y = Math.abs(a[r]);
    if (x > y) {
      res[index] = x * x;
      index--;
      l++;
    } else {
      res[index] = y * y;
      index--;
      r--;
    }
  }
  return res;
};

console.log(sortArrayWithSquare(a));
