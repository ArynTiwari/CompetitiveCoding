const Queue = require("../../jsClass/Queue");
const Node = require("./Node");
let root = new Node(1);
root.left = new Node(2);
root.right = new Node(10);
root.right.right = new Node(6);
root.left.left = new Node(4);
root.left.right = new Node(5);

const sizeOfBTree = (root) => {
  if (root == null) return 0;
  //   return sizeOfBTree(root.left) + sizeOfBTree(root.right) + 1;
  let s1 = sizeOfBTree(root.left);
  let s2 = sizeOfBTree(root.right);
  return s1 + s2 + 1;
};
console.log(sizeOfBTree(root));
