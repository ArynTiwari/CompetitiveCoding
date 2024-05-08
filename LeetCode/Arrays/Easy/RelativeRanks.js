/**
 * @param {number[]} score
 * @return {string[]}
 */
var findRelativeRanks = function (score) {
  if (score.length === 1) {
    score[0] = "Gold Medal";
  } else if (score.length === 2) {
    if (score[0] > score[1]) {
      score[0] = "Gold Medal";
      score[1] = "Silver Medal";
    } else {
      score[0] = "Silver Medal";
      score[1] = "Gold Medal";
    }
  } else {
    let sorted = score.slice().sort((a, b) => b - a);
    const [high, mid, low] = sorted.slice(0, 3);
    for (let i = 0; i < score.length; i++) {
      if (score[i] === high) {
        score[i] = "Gold Medal";
      } else if (score[i] === mid) {
        score[i] = "Silver Medal";
      } else if (score[i] === low) {
        score[i] = "Bronze Medal";
      } else {
        score[i] = (sorted.indexOf(score[i]) + 1).toString();
      }
    }
  }
  return score;
};

const score = [5, 4, 3, 2, 1];
console.log(findRelativeRanks(score)); // Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]

const score2 = [3];
console.log(findRelativeRanks(score2)); // Output: ["Gold Medal"]

const score3 = [2, 1];
console.log(findRelativeRanks(score3)); // Output: ["Gold Medal", "Silver Medal"]
