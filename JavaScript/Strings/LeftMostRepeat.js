const leftRepeat = (s) => {
  const count = {};
  for (let i = 0; i < s.length; i++) {
    count[s.charAt(i)] = (count[s.charAt(i)] || 0) + 1;
  }
//   for (let i in count) {
//     console.log(count[i]);
//   }
  for (let i = 0; i < s.length; i++) {
    if (count[s.charAt(i)] === 1) {
      return s.charAt(i);
    }
  }
  return '$';
};

console.log(leftRepeat("abbccddaa"));
