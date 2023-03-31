const nums = [4, 5, 6, 7, 0, 1, 2];

const search = (nums, target) => {
  let ans = 0;
  for (let index = 0; index < nums.length; index++) {
    if (nums[index] == target) {
      ans = nums[index];
    }
  }
  if (ans) {
    console.log(ans);
  } else {
    console.log(-1);
  }
};
search(nums, 4);
