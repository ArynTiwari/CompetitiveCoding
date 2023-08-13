var firstMissingPositive = function (nums) {
  const n = nums.length;

  // Cycle sort
  for (let i = 0; i < n; i++) {
    while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] !== nums[i]) {
      [nums[nums[i] - 1], nums[i]] = [nums[i], nums[nums[i] - 1]];
    }
  }

  // Find the first missing positive integer
  for (let i = 0; i < n; i++) {
    if (nums[i] !== i + 1) {
      return i + 1;
    }
  }

  return n + 1;
};

// Example usage
const nums = [3, 4, 1, -5, 2];
const result = firstMissingPositive(nums);
console.log(result); // Output: 2
