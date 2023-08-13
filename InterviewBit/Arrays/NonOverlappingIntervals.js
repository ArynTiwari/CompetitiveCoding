/**
 * @param {number[][]} intervals
 * @return {number}
 */
var eraseOverlapIntervals = function (intervals) {
  if (intervals.length <= 1) {
    return 0;
  }

  intervals.sort((a, b) => a[0] - b[0]);

  let count = 0;
  let prevEnd = intervals[0][1];

  for (let i = 1; i < intervals.length; i++) {
    if (intervals[i][0] < prevEnd) {
      count++;
      prevEnd = Math.min(prevEnd, intervals[i][1]);
    } else {
      prevEnd = intervals[i][1];
    }
  }

  return count;
};
const intervals = [
  [1, 2],
  [1, 2],
  [1, 2],
];
console.log(eraseOverlapIntervals(intervals));
