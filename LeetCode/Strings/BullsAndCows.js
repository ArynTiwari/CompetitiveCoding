const bullsCows = (sec, gue) => {
  let ans = Array(10).fill(0);
  let bulls = 0,
    cows = 0;
  for (let i = 0; i < sec.length; i++) {
    let s = sec[i] - "0";
    let g = gue[i] - "0";
    if (s === g) {
      bulls++;
    } else {
      if (ans[s]++ < 0) {
        cows++;
      }
      if (ans[g]-- > 0) {
        cows++;
      }
    }
  }
  return `${bulls}A${cows}B`;
};
console.log(bullsCows("1807", "7810"));
