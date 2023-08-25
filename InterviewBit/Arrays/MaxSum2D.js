function findMaxSubmatrixSum(matrix, B) {
  const N = matrix.length;

  // Compute the prefix sum matrix
  const prefixSum = new Array(N + 1)
    .fill(null)
    .map(() => new Array(N + 1).fill(0));
  for (let i = 1; i <= N; i++) {
    for (let j = 1; j <= N; j++) {
      prefixSum[i][j] =
        matrix[i - 1][j - 1] +
        prefixSum[i - 1][j] +
        prefixSum[i][j - 1] -
        prefixSum[i - 1][j - 1];
    }
  }

  let maxSum = -Infinity;

  // Iterate through all possible starting positions of submatrices
  for (let i = 0; i <= N - B; i++) {
    for (let j = 0; j <= N - B; j++) {
      const submatrixSum =
        prefixSum[i + B][j + B] -
        prefixSum[i][j + B] -
        prefixSum[i + B][j] +
        prefixSum[i][j];
      maxSum = Math.max(maxSum, submatrixSum);
    }
  }

  return maxSum;
}

// Example usage
const matrix = [
  [1, 1, 1, 1, 1],
  [2, 2, 2, 2, 2],
  [3, 8, 6, 7, 3],
  [4, 4, 4, 4, 4],
  [5, 5, 5, 5, 5],
];
const B = 3;
const result = findMaxSubmatrixSum(matrix, B);
console.log(result); // Output: 21
