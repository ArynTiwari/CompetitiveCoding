const isPalindrome = (str) => {
  const cleanedStr = str.replace(/[^a-zA-Z0-9]/g, "").toLowerCase();
  const n = cleanedStr.length;

  for (let i = 0; i < Math.floor(n / 2); i++) {
    if (cleanedStr[i] !== cleanedStr[n - i - 1]) {
      return 0; // Not a palindrome
    }
  }

  return 1;
};
console.log(isPalindrome("A man, a plan, a canal: Panama"));
