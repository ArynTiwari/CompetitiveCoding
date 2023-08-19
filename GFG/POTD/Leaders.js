const arr = [10, 17, 2, 15, 4, 9];
const leader = (arr) => {
  let ans = [];
  ans.push(arr[arr.length - 1]);
  for (let i = arr.length - 2; i >= 0; i--) {
    if (arr[i] > ans[ans.length - 1]) {
      ans.push(arr[i]);
    }
  }
  console.log(ans.reverse());
  return ans;
};
leader(arr);
