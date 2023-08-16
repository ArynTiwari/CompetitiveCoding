/**
 * @param {number[][]} intervals
 * @param {number[]} newInterval
 * @return {number[][]}
 */
// var insert = function (intervals, newInterval) {
//   intervals.push(newInterval);
//   intervals.sort((a, b) => a[0] - b[0]);
//   let ans = [];
//   ans.push(intervals[0]);
//   for (let i = 1; i < intervals.length; i++) {
//     if (ans[ans.length - 1][1] >= intervals[i][0]) {
//       ans[ans.length - 1][1] = Math.max(
//         ans[ans.length - 1][1],
//         intervals[i][1]
//       );
//     } else {
//       ans.push(intervals[i]);
//     }
//   }
// //   console.log(intervals);
//   return ans;
// };
var insertOptimal = function (intervals, newInterval) {
  let ans = [];
  let i = 0;
  let n = intervals.length;
  while (i < n) {
    if (intervals[i][1] < newInterval[0]) {
      ans.push(intervals[i]);
    } else if (intervals[i][0] > newInterval[1]) {
      break;
    } else {
      newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
      newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
    }
    i++;
  }
  ans.push(newInterval);
  while (i < n) {
    ans.push(intervals[i]);
    i++;
  }
  return ans;
};
let intervals = [
    [1, 3],
    [6, 9],
  ],
  newInterval = [2, 5];
console.log(insert(intervals, newInterval));
