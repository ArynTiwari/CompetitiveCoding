/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var reverse = function (arr, s, e) {
  while (s < e) {
    let temp = arr[s];
    arr[s] = arr[e];
    arr[e] = temp;
    s++;
    e--;
  }
};
var rotate = function (arr, k) {
  let n = arr.length;
  k = k % n;
  reverse(arr, k, n - 1);
  reverse(arr, 0, k - 1);
  reverse(arr, 0, n - 1);
  return arr;
};
let nums = [1, 2, 3, 4, 5, 6, 7],
  k = 3;
console.log(rotate(nums, k));
