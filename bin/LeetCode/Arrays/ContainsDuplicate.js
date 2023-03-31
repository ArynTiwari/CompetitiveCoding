const nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2];
const containsDuplicate = (nums) => {
  let ans = 0;
  for (let i = 0; i < nums.length; i++) {
    ans = ans ^ nums[i];
  }
  for (let i = 1; i < nums.length; i++) {
    ans = ans ^ i;
  }
  return ans;
};
console.log(containsDuplicate(nums));
