function isIsogram(s) {
  const count = {};

  for (let i = 0; i < s.length; i++) {
    count[s.charAt(i)] = (count[s.charAt(i)] || 0) + 1;
  }
  for (const char in count) {
    if (count[char] > 1) {
      return false;
    }
  }

  return true;
}

console.log(isIsogram("geeks"));
