/**
 * @param {string} s1
 * @param {string} s2
 * @returns {string}
 */

const concat = (s1, s2) => {
  const commonCharsSet = new Set();
  for (let c of s1) {
    if (s2.includes(c)) {
      commonCharsSet.add(c);
    }
  }
  if (commonCharsSet.size === 0) {
    return "-1";
  }
  let res = "";
  for (let c of s1 + s2) {
    if (!commonCharsSet.has(c)) {
      res += c;
    }
  }
  return res;
};
let ans = concat("abc", "efg");
console.log(ans);
