const Node = require("../../jsClass/Node");
const Queue = require("../../jsClass/Queue");
let root = new Node(1);
root.left = new Node(2);
root.right = new Node(3);
root.left.left = new Node(4);
root.left.right = new Node(5);
root.right.left = new Node(6);
root.right.right = new Node(7);

const mirror = (root) => {
  if (root == null) {
    return null;
  }
  let leftMirror = mirror(root.left);
  let rightMirror = mirror(root.right);
  root.left = rightMirror;
  root.right = leftMirror;
  return root;
};
const mirrorOpt = (root) => {
  if (root == null) return null;
  let q = new Queue();
  q.enqueue(root);
  while (!q.isEmpty()) {
    let curr = q.dequeue();
    let temp = curr.left;
    curr.left = curr.right;
    curr.right = temp;
    if (curr.left != null) {
      q.enqueue(curr.left);
    }
    if (curr.right != null) {
      q.enqueue(curr.right);
    }
  }
  return root;
};
const inorder = (root) => {
  if (root == null) return;
  inorder(root.left);
  console.log(root.value);
  inorder(root.right);
};

console.log("Original tree (Inorder traversal):");
inorder(root);

mirrorOpt(root);

console.log("Mirror tree (Inorder traversal):");
inorder(root);
