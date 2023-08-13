/**
 * @param {number[][]} intervals
 * @return {number[][]}
 */
var merge = function (intervals) {
  intervals.sort((a, b) => a[0] - b[0]);
  let ans = [];
  ans.push(intervals[0]);
  for (let i = 1; i < intervals.length; i++) {
    if (ans[ans.length - 1][1] >= intervals[i][0]) {
      ans[ans.length - 1][1] = Math.max(
        intervals[i][1],
        ans[ans.length - 1][1]
      );
    } else {
      ans.push(intervals[i]);
    }
  }
  return ans;
};
const intervals = [
  [1, 3],
  [2, 6],
  [8, 10],
  [15, 18],
];
console.log(merge(intervals));
function insertInterval(intervals, newInterval) {
  const result = [];
  let i = 0;

  // Add intervals before newInterval
  while (i < intervals.length && intervals[i][1] < newInterval[0]) {
    result.push(intervals[i]);
    i++;
  }

  // Merge overlapping intervals
  while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
    newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
    newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
    i++;
  }

  result.push(newInterval);

  // Add intervals after newInterval
  while (i < intervals.length) {
    result.push(intervals[i]);
    i++;
  }

  return result;
}
console.log(insertInterval());
