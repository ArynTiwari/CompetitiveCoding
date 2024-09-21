// trees/preorderTraversal.js

const Node = require("./Node");

function postorderTraversal(root) {
  if (root === null) return;
  postorderTraversal(root.left);
  postorderTraversal(root.right);
  console.log(root.value);
}

// Example usage
let root = new Node(1);
root.left = new Node(2);
root.right = new Node(3);
root.left.left = new Node(4);
root.left.right = new Node(5);

postorderTraversal(root);