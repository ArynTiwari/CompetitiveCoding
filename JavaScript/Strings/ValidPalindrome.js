const isPalindrom = function (str) {
  s = str.replace(/[^a-z0-9]/gi, "").toLowerCase();
  console.log(s);
  t = s.split("").reverse().join("");
  return s === t;
};

const ans = isPalindrom("ab_a");
console.log(ans);
