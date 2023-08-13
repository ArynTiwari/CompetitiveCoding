const countWaysToSplit = (B) => {
  const n = B.length;
  let totalSum = 0;
  for (let num of B) {
    totalSum += num;
  }

  if (totalSum % 3 !== 0) {
    return 0; // Total sum is not divisible by 3
  }

  const oneThridSum = totalSum / 3;
  let twoThridSum = 2 * oneThridSum;
  let count = 0;
  let sum = 0;
  let oneThirdCount = 0;
  for (let i = 0; i < B.length - 1; i++) {
    sum += B[i];
    if (sum === twoThridSum) {
      count += oneThirdCount;
    }
    if (sum === oneThridSum) {
      oneThirdCount++;
    }
  }

  return count;
};

// Example usage
const B = [1, 2, 3, 0, 3];
const ways = countWaysToSplit(B);
console.log(ways); // Output: 2
