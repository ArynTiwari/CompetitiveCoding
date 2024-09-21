const Queue = require("../../jsClass/Queue");
const Node = require("./Node");
let root = new Node(1);
root.left = new Node(2);
root.right = new Node(10);
root.left.left = new Node(4);
root.left.right = new Node(5);
const height = (root) => {
  if (root == null) return 0;
  else {
    return Math.max(height(root.left), height(root.right)) + 1;
  }
};

const levelOrder = (root, k) => {
  if (root == null) return [];
  if (k == 0) {
    return [root.value];
  } else {
    return [...levelOrder(root.left, k - 1), ...levelOrder(root.right, k - 1)];
  }
};

const bfs = (root) => {
  let h = height(root),
    arr = [];
  for (let i = 0; i < h; i++) {
    arr.push(...levelOrder(root, i));
  }
  console.log(arr);
};

const bfsQueue = (root) => {
  if (root == null) return;
  let q = new Queue();
  q.enqueue(root);
  while (!q.isEmpty()) {
    let curr = q.dequeue();
    console.log(curr.value);
    if (curr.left != null) {
      q.enqueue(curr.left);
    }
    if (curr.right != null) {
      q.enqueue(curr.right);
    }
  }
};
bfs(root);
bfsQueue(root)
