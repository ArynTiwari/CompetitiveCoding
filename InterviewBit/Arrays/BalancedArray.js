var countSpecialElements = function (A) {
  const n = A.length;
  let count = 0;

  // Calculate cumulative sums of even and odd indexed elements
  const evenSum = new Array(n).fill(0);
  const oddSum = new Array(n).fill(0);

  evenSum[0] = A[0];
  oddSum[0] = 0;

  for (let i = 1; i < n; i++) {
    evenSum[i] = evenSum[i - 1] + (i % 2 === 0 ? A[i] : 0);
    oddSum[i] = oddSum[i - 1] + (i % 2 !== 0 ? A[i] : 0);
  }

  // Check if removing each element makes the array balanced
  for (let i = 0; i < n; i++) {
    const prevEvenSum = i > 0 ? evenSum[i - 1] : 0;
    const prevOddSum = i > 0 ? oddSum[i - 1] : 0;

    const newEvenSum = i < n - 1 ? oddSum[n - 1] - oddSum[i] : 0;
    const newOddSum = i < n - 1 ? evenSum[n - 1] - evenSum[i] : 0;

    if (prevEvenSum + newEvenSum === prevOddSum + newOddSum) {
      count++;
    }
  }

  return count;
};

// Example usage
const A = [2, 1, 6, 4];
const specialCount = countSpecialElements(A);
console.log(specialCount); // Output: 1
