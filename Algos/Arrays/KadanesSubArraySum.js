const maxSum = (arr) => {
  let maxEndingHere = arr[0];
  let maxSoFar = arr[0];
  let startIndex = 0;
  let endIndex = 0;
  let tempStartIndex = 0;

  for (let i = 1; i < arr.length; i++) {
    if (arr[i] > maxEndingHere + arr[i]) {
      maxEndingHere = arr[i];
      tempStartIndex = i;
    } else {
      maxEndingHere = maxEndingHere + arr[i];
    }

    if (maxEndingHere > maxSoFar) {
      maxSoFar = maxEndingHere;
      startIndex = tempStartIndex;
      endIndex = i;
    }
  }

  return {
    maxSum: maxSoFar,
    subarray: arr.slice(startIndex, endIndex + 1),
  };
};
let a = [-1, 2, -3, 4, 5];
let ans = maxSum(a);
console.log(ans.subarray);
