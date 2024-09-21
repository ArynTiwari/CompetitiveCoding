/**
 * @param {string} s
 * @param {array} ar
 * @return {number}
 */
var lengthOfLastWord = function (s) {
  let arr = s.split(" ");
  for (let i = arr.length - 1; i >= 0; i--) {
    if (arr[i] != "") {
      return arr[i].length;
    } else {
      continue;
    }
  }
};
let str = "   fly me   to   the moon  ";
console.log(lengthOfLastWord(str));
