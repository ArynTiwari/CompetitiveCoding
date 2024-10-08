const Node = require("./Node");
const height = (root) => {
  if (root == null) {
    return 0;
  } else {
    return Math.max(height(root.left), height(root.right)) + 1;
  }
};

let root = new Node(1);
root.left = new Node(2);
root.right = new Node(3);
root.left.left = new Node(4);
root.left.right = new Node(5);
console.log(height(root));
