function countAndSay(n) {
  if (n === 1) {
    return "1"; // Base case
  }

  const say = countAndSay(n - 1);
  let result = "";
  let count = 1;

  for (let i = 0; i < say.length; i++) {
    if (say[i] === say[i + 1]) {
      count++;
    } else {
      result += count + say[i];
      count = 1;
    }
  }

  return result;
}

// Example usage
const n = 5;
const result = countAndSay(n);
console.log(result); // Output: "111221"
