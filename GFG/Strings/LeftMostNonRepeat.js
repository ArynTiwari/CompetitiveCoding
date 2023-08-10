function firstNonRepeatingCharacter(s) {
  let arr = new Array(256);
  arr.fill(-1);

  for (let i = 0; i < s.length; i++) {
    if (arr[s.charCodeAt(i)] === -1) {
      arr[s.charCodeAt(i)] = i;
    } else if (arr[s.charCodeAt(i)] >= 0) {
      arr[s.charCodeAt(i)] = -2;
    }
  }

  let res = Number.MAX_VALUE;
  for (let i = 0; i < 256; i++) {
    if (arr[i] >= 0) {
      res = Math.min(res, arr[i]);
    }
  }

  return res === Number.MAX_VALUE ? -1 : res;
}

const s = "abcdabc";
console.log(firstNonRepeatingCharacter(s)); // Output should be the index of 'l'
