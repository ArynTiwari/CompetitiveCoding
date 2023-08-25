function canPermuteStringsEqual(A, B) {
  if (A.length !== B.length) {
    return 0;
  }

  const charCountA = new Array(26).fill(0);
  const charCountB = new Array(26).fill(0);

  for (let i = 0; i < A.length; i++) {
    charCountA[A.charCodeAt(i) - "a".charCodeAt(0)]++;
    charCountB[B.charCodeAt(i) - "a".charCodeAt(0)]++;
  }

  for (let i = 0; i < 26; i++) {
    if (charCountA[i] !== charCountB[i]) {
      return 0;
    }
  }

  return 1;
}
const A = "scaler";
const B = "relasc";
console.log(canPermuteStringsEqual(A, B));
