const MOD = 1e9 + 7;

function isVowel(ch) {
  return "aeiouAEIOU".includes(ch);
}

function countSubstrings(str) {
  let consoCount = 0,
    vovCount = 0,
    ans = 0;
  for (let i = 0; i < str.length; i++) {
    if (isVowel(str[i])) {
      vovCount++;
      ans += consoCount;
    } else {
      consoCount++;
      ans += vovCount;
    }
  }
  return ans % MOD;
}

const inputString = "inttnikjmjbemrberk";
const result = countSubstrings(inputString);
console.log(result); // Output the count of substrings
