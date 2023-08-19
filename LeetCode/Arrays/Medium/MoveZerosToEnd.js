const nums = [0, 1, 0, 3, 0, 12];
const moveToEnd = (nums) => {
  let count = 0;
  for (let index = 0; index < nums.length; index++) {
    if (nums[index] !== 0) {
      nums[count++] = nums[index];
      nums[index] = 0;
    }
  }
  //   for (let i = 0; i < nums.legth; i++) {
  //     if (nums[i] == 0) {
  //       count++;
  //     } else if (count > 0) {
  //       nums[i - count] = nums[i];
  //       nums[i] = 0;
  //     }
  //   }

  return nums;
};
console.log(moveToEnd(nums));
