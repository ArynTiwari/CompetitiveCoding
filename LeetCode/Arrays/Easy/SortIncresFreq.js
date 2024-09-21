/**
 * @param {number[]} nums
 * @return {number[]}
 */
var frequencySort = function (nums) {
  let ans = [];
  let mp = new Map();
  nums.forEach((ele) => {
    if (mp.has(ele)) {
      mp.set(ele, mp.get(ele) + 1);
    } else {
      mp.set(ele, 1);
    }
  });
  let sortedArray = Array.from(mp.entries()).sort((a, b) => {
    if (a[1] !== b[1]) {
      return a[1] - b[1];
    } else {
      return b[0] - a[0];
    }
  });
  sortedArray.forEach(([num, freq]) => {
    for (let i = 0; i < freq; i++) {
      ans.push(num);
    }
  });
  return ans;
};
const nums = [1, 1, 2, 2, 2, 3];
console.log(frequencySort(nums));
