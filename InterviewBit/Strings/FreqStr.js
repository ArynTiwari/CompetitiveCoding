function characterFrequencyString(str) {
  const obj = {};
  for (let i of str) {
    if (obj.hasOwnProperty(i)) {
      obj[i]++;
    } else {
      obj[i] = 1;
    }
  }
  let ans = "";
  for (let j in obj) {
    ans += j;
    ans += obj[j];
  }
  return ans;
}

// Test case
const inputString = "aabbccc";
const outputString = characterFrequencyString(inputString);
console.log(outputString); // Output: "a2b2c3"
