/**
 * @param {number[]} nums
 * @param {number} pivot
 * @return {number[]}
 */
var pivotArray = function (nums, pivot) {
  let small = [];
  let greater = [];
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] < pivot) {
      small.push(nums[i]);
    } else if (nums[i] > pivot) {
      greater.push(nums[i]);
    }
  }
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] === pivot) {
      small.push(nums[i]);
    }
  }
  small.push(...greater);
  return small;
};

const nums = [4, 3, 5, 1, 2];
console.log(pivotArray(nums, 3));
