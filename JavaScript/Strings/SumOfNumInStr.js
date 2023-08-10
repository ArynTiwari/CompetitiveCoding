const findSum = (s) => {
  j = s.match(/\d+/g).map(Number);
  const sum = j.reduce((a, b) => a + b, 0);
  console.log(sum);
};

let ans = findSum("ge100eks4g 4ee  5ks");
