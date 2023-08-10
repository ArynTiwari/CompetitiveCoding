/**
 * @param {string} a
 * @param {string} b
 */
const isRotated = (a, b) => {
  if (a.length !== b.length) {
    return false;
  }
  let leftRotation = "";
  for (let i = 2; i < a.length; i++) {
    leftRotation += a.charAt(i);
  }
  for (let i = 0; i < 2; i++) {
    leftRotation += a.charAt(i);
  }
  let rightRotation = "";
  for (let i = 2; i < b.length; i++) {
    rightRotation += b.charAt(i);
  }
  for (let i = 0; i < 2; i++) {
    rightRotation += b.charAt(i);
  }
  return leftRotation.includes(b) || rightRotation.includes(b);
};
let ans = isRotated("wlrbbmqbhcdar", "owkkyhiddqscd");

console.log(ans);
