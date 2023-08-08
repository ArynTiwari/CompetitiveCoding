/**
 * @param {string} s
 * @param {number} k
 * @return {string}
 */
var orderlyQueue = function (s, k) {
  if (k > 1) {
    return s.split("").sort((a, b) => a - b);
  }
  let res = s;
  for (let l = 1; l <= s.length - 1; l++) {
    let temp = s.substring(l) + s.substring(0, l);
    if (temp < res) {
      res = temp;
    }
  }
  return res;
};

console.log(orderlyQueue("baaca", 1));
