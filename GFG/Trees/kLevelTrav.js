const Node = require("./Node");

const printKLevel = (root, k) => {
  if (root == null) {
    return;
  }
  if (k == 0) {
    console.log(root.value);
  } else {
    printKLevel(root.left, k - 1);
    printKLevel(root.right, k - 1);
  }
};

let root = new Node(1);
root.left = new Node(2);
root.right = new Node(3);
root.left.left = new Node(4);
root.left.right = new Node(5);
printKLevel(root, 2);
