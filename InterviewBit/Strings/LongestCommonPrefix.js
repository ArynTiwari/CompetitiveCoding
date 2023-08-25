const commonChars = (s1, s2) => {
  let res = "";
  let n = Math.min(s1.length, s2.length);
  for (let i = 0; i < n; i++) {
    if (s1[i] === s2[i]) {
      res += s1[i];
    } else {
      break;
    }
  }
  return res;
};
const longestCommonPrefix = (a) => {
  let res = a[0];
  for (let i = 1; i < a.length; i++) {
    res = commonChars(res, a[i]);
  }
  return res;
};
let a = ["abcdefgh", "abefghijk", "abcefgh"];
console.log(longestCommonPrefix(a));
