/**
 * @param {string} a
 * @param {string} b
 * @return {boolean}
 */
var checkPalindromeFormation = function (a, b) {
  const isPal = (str, s, e) => {
    while (s < e) {
      if (str[s] === str[e]) s++, e--;
      else return false;
    }
    return true;
  };
  let s = 0,
    e = b.length - 1;
  while (s < e && a[s] === b[e]) s++, e--;
  if (isPal(a, s, e) || isPal(b, s, e)) return true;
  (s = 0), (e = a.length - 1);
  while (s < e && b[s] === a[e]) s++, e--;
  if (isPal(a, s, e) || isPal(b, s, e)) return true;
  return false;
};
let a = "ulacfd",
  b = "jizalu";
console.log(checkPalindromeFormation(a, b));
