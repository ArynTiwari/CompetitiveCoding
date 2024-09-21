const Node = require("./Node");
const Queue = require("../../jsClass/Queue");
let zigZagTraversal = (root) => {
  if (!root) return [];
  let currentLevel = [];
  let nextLevel = [];
  let ans = [];
  let leftToRight = true;
  currentLevel.push(root);
  while (currentLevel.length > 0) {
    let node = currentLevel.pop();
    console.log(node.data);
    ans.push(node.data);
    if (leftToRight) {
      if (node.left) nextLevel.push(node.left);
      if (node.right) nextLevel.push(node.right);
    } else {
      if (node.right) nextLevel.push(node.right);
      if (node.left) nextLevel.push(node.left);
    }
    if (currentLevel.length === 0) {
      leftToRight = !leftToRight;
      let temp = currentLevel;
      currentLevel = nextLevel;
      nextLevel = temp;
    }
  }
  return ans;
};
