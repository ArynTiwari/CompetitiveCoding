const Queue = require("../../jsClass/Queue");
const Node = require("./Node");
let root = new Node(1);
root.left = new Node(2);
root.right = new Node(10);
root.left.left = new Node(4);
root.left.right = new Node(5);

const lineByLine = (root) => {
  if (root == null) {
    return;
  }
  let q = new Queue();
  q.enqueue(root);
  while (!q.isEmpty()) {
    let cnt = q.size();
    for (let i = 0; i < cnt; i++) {
      let curr = q.dequeue();
      console.log(curr.value);
      if (curr.left != null) {
        q.enqueue(curr.left);
      }
      if (curr.right != null) {
        q.enqueue(curr.right);
      }
    }
    console.log(" ");
  }
};
lineByLine(root);
