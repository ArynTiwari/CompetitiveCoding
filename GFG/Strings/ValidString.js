/**
 * @param {string} s
 * @returns {number}
 */
const makeStringValid = (s) => {
  let count = 1; 
  let insertions = 0;
  let prevChar = s.charAt(0);

  for (let i = 1; i < s.length; i++) {
    if (s.charAt(i) === prevChar) {
      count++;
      if (count === 3) {
        insertions++;
        count = 1;
      }
    } else {
      count = 1;
    }
    prevChar = s.charAt(i);
  }

  return insertions;
};

let anss = makeStringValid("aaaaaa");
console.log(anss);
