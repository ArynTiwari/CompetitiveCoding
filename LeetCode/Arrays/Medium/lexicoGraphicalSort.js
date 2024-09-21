// var lexicalOrder = function (n) {
//   let arr = [];
//   for (let i = 1; i <= n; i++) {
//     arr.push(i);
//   }
//   return arr.map(String).sort().map(Number);
// };
// console.log(lexicalOrder(13));

var solve = function (curr, limit, res) {
  if (curr > limit) return;
  res.push(curr);

  for (let nextDigit = 0; nextDigit <= 9; nextDigit++) {
    let nextNumber = curr * 10 + nextDigit;
    if (nextNumber > limit) return;
    solve(nextNumber, limit, res);
  }
};

var lexicalOrder = function (n) {
  let res = [];
  for (let i = 1; i <= 9; i++) {
    solve(i, n, res);
  }
  return res;
};

// Example usage
console.log(lexicalOrder(13)); // Output: [1, 10, 11, 12, 13, 2, 3]
