/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */

var maxSlidingWindow = function (nums, k) {
  let ans = [];
  let deque = [];
  for (let i = 0; i < nums.length; i++) {
    while (deque.length > 0 && deque[0] < i - k + 1) {
      deque.shift();
    }

    while (deque.length > 0 && nums[deque[deque.length - 1]] < nums[i]) {
      deque.pop();
    }

    deque.push(i);

    if (i >= k - 1) {
      ans.push(nums[deque[0]]);
    }
  }

  return ans;
};
let nums = [1, 3, -1, -3, 5, 3, 6, 7];
const k = 3;

console.log(maxSlidingWindow(nums, k));
