const tripletSum = (arr) => {
  const n = arr.length;
  arr = arr.map(Number).sort((a, b) => a - b);

  for (let i = 0; i < n - 2; i++) {
    let left = i + 1;
    let right = n - 1;

    while (left < right) {
      const sum = arr[i] + arr[left] + arr[right];
      if (sum > 2) {
        right--;
      } else if (sum < 1) {
        left++;
      } else {
        return 1;
      }
    }
  }

  return 0;
};
let arr = ["0.6", "0.7", "0.8", "1.2", "0.4"];
console.log(tripletSum(arr));
