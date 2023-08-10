/**
 *
 * @param {Array} a
 */
const majorElemen = (a) => {
  let major = a[0];
  let count = 1;
  for (let i = 0; i < a.length; i++) {
    if (count === 0) {
      major = a[i];
      count = 1;
    } else if (a[i] === major) {
      count++;
    } else {
      count--;
    }
  }
  return major;
};
let a=[1,1,2,2,3,4,5,5,6,6,6,7,8]
let ans = majorElemen(a);
console.log(ans)