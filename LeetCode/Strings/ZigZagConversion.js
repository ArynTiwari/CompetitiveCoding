/**
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
var convert = function (s, numRows) {
  if (numRows === 1) {
    return s;
  }
  let res = "";
  const n = s.length;
  const cycleLen = 2 * numRows - 2;
  for (let i = 0; i < numRows; i++) {
    for (let j = 0; j + i < n; j += cycleLen) {
      res += s[j + i];
      if (i !== 0 && i !== numRows - 1 && j + cycleLen - i < n) {
        res += s[j + cycleLen - i];
      }
    }
  }
  return res;
};
let s = "PAYPALISHIRING",
  numRows = 3;
console.log(convert(s, numRows));
