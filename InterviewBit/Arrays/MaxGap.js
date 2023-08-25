const maxGap = (arr) => {
  let max = 0;
  arr.sort((a, b) => a - b);
  for (let i = 1; i < arr.length; i++) {
    max = Math.max(max, Math.abs(arr[i - 1] - arr[i]));
  }
  return max;
};
let arr = [1, 10, 5];
console.log(maxGap(arr));
