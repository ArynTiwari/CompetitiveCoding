/**
 *
 * @param {array} ar1
 * @param {array} ar2
 */
let mergedArray = (ar1, ar2) => {
  let i = 0,
    j = 0,
    merged = [];
  while (i < ar1.length && j < ar2.length) {
    if (ar1[i] < ar2[j]) {
      merged.push(ar1[i++]);
    } else {
      merged.push(ar2[j++]);
    }
  }
  while (i < ar1.length) {
    merged.push(ar1[i++]);
  }
  while (j < ar2.length) {
    merged.push(ar2[j++]);
  }
  return merged;
};
