function findKthLargest(nums, k) {
  const partition = (left, right) => {
    const pivot = nums[right];
    let i = left - 1;

    for (let j = left; j < right; j++) {
      if (nums[j] >= pivot) {
        i++;
        [nums[i], nums[j]] = [nums[j], nums[i]];
      }
    }

    [nums[i + 1], nums[right]] = [nums[right], nums[i + 1]];
    return i + 1;
  };

  const quickselect = (left, right, k) => {
    if (left <= right) {
      const pivotIndex = partition(left, right);

      if (pivotIndex === k) {
        return nums[pivotIndex];
      } else if (pivotIndex < k) {
        return quickselect(pivotIndex + 1, right, k);
      } else {
        return quickselect(left, pivotIndex - 1, k);
      }
    }
  };

  return quickselect(0, nums.length - 1, k - 1);
}

const nums = [3, 2, 1, 5, 6, 4];
const k = 2;
console.log(findKthLargest(nums, k)); // Output: 5
