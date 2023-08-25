/**
 * @param {string} num1
 * @param {string} num2
 * @return {string}
 */
var addStrings = function (num1, num2) {
  let l1 = num1.length,
    l2 = num2.length,
    carry = 0,
    res = "";

  while (l1 > 0 || l2 > 0 || carry) {
    let dig1 = l1 > 0 ? parseInt(num1[l1 - 1]) : 0;
    let dig2 = l2 > 0 ? parseInt(num2[l2 - 1]) : 0;

    let sum = dig1 + dig2 + carry;
    res = (sum % 10) + res;
    carry = Math.floor(sum / 10);

    l1--;
    l2--;
  }
  return res;
};
let num1 = "11",
  num2 = "123";
addStrings(num1, num2);
