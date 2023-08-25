function findMajorityElement(nums) {
  let candidate1 = null;
  let candidate2 = null;
  let count1 = 0;
  let count2 = 0;

  // Step 1: Find the potential candidates
  for (const num of nums) {
    if (candidate1 === num) {
      count1++;
    } else if (candidate2 === num) {
      count2++;
    } else if (count1 === 0) {
      candidate1 = num;
      count1 = 1;
    } else if (count2 === 0) {
      candidate2 = num;
      count2 = 1;
    } else {
      count1--;
      count2--;
    }
  }

  // Step 2: Verify the candidates
  count1 = 0;
  count2 = 0;
  for (const num of nums) {
    if (candidate1 === num) {
      count1++;
    } else if (candidate2 === num) {
      count2++;
    }
  }
  console.log(candidate1,candidate2);
  const n = nums.length;
  if (count1 > n / 3) {
    return candidate1;
  }
  if (count2 > n / 3) {
    return candidate2;
  }
  return -1;
}

// Example usage
const nums = [3, 3, 2, 2, 3, 1, 1, 1];
const result = findMajorityElement(nums);
console.log(result); // Output: 1
