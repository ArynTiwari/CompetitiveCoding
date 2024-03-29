const convertToNum = (A) => {
  let a = [
    "",
    "one",
    "two",
    "three",
    "four",
    "five",
    "six",
    "seven",
    "eight",
    "nine",
    "ten",
    "eleven",
    "twelve",
    "thirteen",
    "fourteen",
    "fifteen",
    "sixteen",
    "seventeen",
    "eighteen",
    "nineteen",
  ];
  let b = [
    "",
    "",
    "twenty",
    "thirty",
    "forty",
    "fifty",
    "sixty",
    "seventy",
    "eighty",
    "ninety",
  ];
  let n = ("000000000" + A)
    .substr(-9)
    .match(/^(\d{2})(\d{2})(\d{2})(\d{1})(\d{2})$/);
  let str = "";
  str +=
    n[1] != 0
      ? (a[Number(n[1])] || b[n[1][0]] + (a[n[1][1]] ? "-" + a[n[1][1]] : "")) +
        "-crore-"
      : "";
  str +=
    n[2] != 0
      ? (a[Number(n[2])] || b[n[2][0]] + (a[n[2][1]] ? "-" + a[n[2][1]] : "")) +
        "-lakh-"
      : "";
  str +=
    n[3] != 0
      ? (a[Number(n[3])] || b[n[3][0]] + (a[n[3][1]] ? "-" + a[n[3][1]] : "")) +
        "-thousand-"
      : "";
  str +=
    n[4] != 0
      ? (a[Number(n[4])] || b[n[4][0]] + (a[n[4][1]] ? "-" + a[n[4][1]] : "")) +
        "-hundred-"
      : "";
  str +=
    n[5] != 0
      ? (str != "" ? "and-" : "") +
        (a[Number(n[5])] || b[n[5][0]] + (a[n[5][1]] ? "-" + a[n[5][1]] : ""))
      : "";
  // console.log(str);
  let q = str.length - 1;
  while (str[q] === "-") {
    q--;
  }
  str = str.slice(0, q + 1);

  return str;
};

console.log(convertToNum("one-thousand-two-hundred-and-thirty-four")); // Output: 1234
