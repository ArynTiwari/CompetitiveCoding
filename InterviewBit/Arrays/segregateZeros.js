/**
 * @param {number[]} a
 */
const arr = [0, 1, 0, 0, 0, 1, 1, 1, 0];
const segreaget = function (a) {
  let count = 0;
  for (let i = 0; i < a.length; i++) {
    if (a[i] == 0) {
      a[count++] = a[i];
    }
  }
  while (count < a.length) {
    a[count++] = 1;
  }
  console.log(a);
};
segreaget(arr);

let x = 10n;
console.log(typeof x);
