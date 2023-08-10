/**
 * @param {string} str
 * @returns {boolean}
 */
const checkPanagram = (str) => {
  const lowercaseAlphabet = "abcdefghijklmnopqrstuvwxyz";
  const uppercaseAlphabet = lowercaseAlphabet.toUpperCase();

  for (let char of lowercaseAlphabet) {
    if (!str.includes(char) && !str.includes(char.toUpperCase())) {
      return false;
    }
  }

  return true;
};
let ans = checkPanagram("abcsdedwifnv");
console.log(ans)
