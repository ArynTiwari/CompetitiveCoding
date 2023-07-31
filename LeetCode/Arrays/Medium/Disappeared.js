const arr = [4, 3, 2, 7, 8, 2, 3, 1];
let indexx = -1;
for (let i = 0; i < arr.length; i++) {
  if (arr[i] < 0) {
    indexx = arr[i] * -1 - 1;
  } else {
    indexx = arr[i] - 1;
  }

  if (arr[indexx] > 0) {
    arr[indexx] = -arr[indexx];
  }
}
console.log(arr);
for (let i = 0; i < arr.length; i++) {
  if (arr[i] > 0) {
    console.log(i);
  }
}
