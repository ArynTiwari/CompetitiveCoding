/**
 * @param {number[]} nums
 * @return {number[]}
 */
var rearrangeArray = function (nums) {
  let i = 0,
    j = 1;
  let result = [];

  for (let n of nums) {
    if (n > 0) {
      //if n is positive number new arrary result[] first number is n
      result[i] = n;
      i += 2;
    } else {
      result[j] = n;
      j += 2;
    }
  }
  console.log(result);
  return result;
};
let nums = [-1, 1];
rearrangeArray(nums);
