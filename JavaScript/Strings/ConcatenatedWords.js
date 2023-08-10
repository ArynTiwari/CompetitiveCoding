function findValidWords(words) {
  const dict = new Set(words);
  const answer = [];

  for (const word of words) {
    const length = word.length;
    const dp = new Array(length + 1).fill(false);
    dp[0] = true;

    for (let i = 1; i <= length; ++i) {
      for (let j = i === length ? 1 : 0; !dp[i] && j < i; ++j) {
        dp[i] = dp[j] && dict.has(word.substring(j, i));
      }
    }

    if (dp[length]) {
      answer.push(word);
    }
  }

  return answer;
}

const inputWords = ["apple", "pie", "app", "le", "a", "applepie"];
const result = findValidWords(inputWords);

console.log(result); // Output: ["apple", "pie", "app", "le"]
