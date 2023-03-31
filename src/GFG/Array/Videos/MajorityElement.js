//Moore voting algorithm
const arr = [8,8,6,6,6,6];
const maxElemen = () => {
  let count = 0,
    major;
  for (let index = 0; index < arr.length; index++) {
    if (count == 0) {
      major = arr[index];
      count += 1;
    } else if (arr[index] == major) {
      count += 1;
    } else {
      count--;
    }
  }
  return major;
};

console.log(maxElemen(arr));
