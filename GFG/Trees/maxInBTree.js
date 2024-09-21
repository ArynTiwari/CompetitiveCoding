const Queue = require("../../jsClass/Queue");
const Node = require("./Node");
let root = new Node(1);
root.left = new Node(2);
root.right = new Node(10);
root.right.right = new Node(6);
root.left.left = new Node(4);
root.left.right = new Node(50);

const maxInBTree = (root) => {
  if (root == null) return -Infinity;
  return Math.max(
    root.value,
    Math.max(maxInBTree(root.left), maxInBTree(root.right))
  );
};
const maxInBtreeQueue = (root) => {
  let max = -Infinity;
  if (root == null) {
    return max;
  }
  let q = new Queue();
  q.enqueue(root);
  while (!q.isEmpty()) {
    let curr = q.dequeue();
    if (curr.value > max) {
      max = curr.value;
    }
    if (curr.left) {
      q.enqueue(curr.left);
    }
    if (curr.right) {
      q.enqueue(curr.right);
    }
  }
  return max;
};
console.log(maxInBtreeQueue(root));
