const Queue = require("../../jsClass/Queue");
const Node = require("./Node");
let root = new Node(35);
root.left = new Node(20);
root.right = new Node(15);
root.left.left = new Node(15);
root.left.right = new Node(5);
root.right.left = new Node(10);
root.right.right = new Node(5);
const childSum = (root) => {
  if (root == null) {
    return 0;
  }
  let q = new Queue();
  q.enqueue(root);
  while (!q.isEmpty()) {
    let curr = q.dequeue();
    let leftVal = curr.left ? curr.left.value : 0;
    let rightVal = curr.right ? curr.right.value : 0;
    let sum = leftVal + rightVal;
    if ((curr.left || curr.right) && curr.value !== sum) {
      return 0;
    }
    if (curr.left) {
      q.enqueue(curr.left);
    }

    if (curr.right) {
      q.enqueue(curr.right);
    }
  }
  return 1;
};
console.log(childSum(root));
