const Queue = require("../../jsClass/Queue");
const Node = require("./Node");
let root = new Node(1);
root.left = new Node(2);
root.right = new Node(10);
root.right.right = new Node(6);
root.left.left = new Node(4);
root.left.right = new Node(5);
function isBalanced(root) {
  if (root == null) return 0;
  let lh = isBalanced(root.left);
  if (lh == -1) return -1;
  let rh = isBalanced(root.right);
  if (rh == -1) return -1;
  if (Math.abs(lh - rh) > 1) {
    return -1;
  } else {
    return Math.max(lh, rh) + 1;
  }
}
console.log(isBalanced(root));
