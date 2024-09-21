// trees/preorderTraversal.js

const Node = require("./Node");

function preorderTraversal(root) {
  if (root === null) return;
  console.log(root.value); // Visit node
  preorderTraversal(root.left); // Visit left subtree
  preorderTraversal(root.right); // Visit right subtree
}

// Example usage
let root = new Node(1);
root.left = new Node(2);
root.right = new Node(3);
root.left.left = new Node(4);
root.left.right = new Node(5);

preorderTraversal(root);
