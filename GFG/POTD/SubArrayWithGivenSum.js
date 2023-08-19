/**
 * @param {number[]} arr
 * @param {number} n
 * @param {number} s
 * @returns {number[]}
 */
let subarraySum = function (arr, n, s) {
  let i = 0,
    j = 0,
    sum = 0,
    ans = Array(2).fill(0);
  while (i < n && s != 0) {
    sum += arr[i];
    while (sum > s) {
      sum -= arr[j];
      j++;
    }
    if (sum === s) {
      ans[0] = j + 1;
      ans[1] = i + 1;
      return ans;
    }
    i++;
  }
  return -1;
};
let arr = [1, 2, -1, -1, -1];
console.log(subarraySum(arr, 5, 12));
