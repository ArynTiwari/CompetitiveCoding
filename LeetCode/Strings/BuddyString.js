/**
 * @param {string} s
 * @param {string} goal
 * @return {boolean}
 */
var checkFreq = function (s) {
  const map = new Map();
  for (const char of s) {
    if (map.has(char)) {
      map.set(char, map.get(char) + 1);
    } else {
      map.set(char, 1);
    }
  }
  for (const [char, frequency] of map) {
    console.log(char);
    if (frequency > 1) {
      return true;
    }
  }
  return false;
};
var buddyStrings = function (s, goal) {
  if (s.length !== goal.length) {
    return false;
  }
  if (s === goal) {
    return checkFreq(s);
  }
  let missIndex = [];
  for (let i = 0; i < s.length; i++) {
    if (s[i] !== goal[i]) {
      missIndex.push(i);
    }
  }
  if (missIndex.length != 2) {
    return false;
  }
  let sArr = s.split("");
  let temp = sArr[missIndex[0]];
  sArr[missIndex[0]] = sArr[missIndex[1]];
  sArr[missIndex[1]] = temp;
  s = sArr.join("");

  if (s === goal) {
    return true;
  }
  return false;
};

console.log(buddyStrings("ab", "ba"));
