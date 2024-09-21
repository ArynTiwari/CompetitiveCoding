class TreeNode {
  constructor(val = 0, left = null, right = null) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

// Inorder traversal to get sorted array from BST
let inorder = (root, arr = []) => {
  if (root) {
    inorder(root.left, arr);
    arr.push(root.val);
    inorder(root.right, arr);
  }
  return arr;
};

// Merge two sorted arrays into one sorted array
let mergedArray = (ar1, ar2) => {
  let i = 0,
    j = 0,
    merged = [];
  while (i < ar1.length && j < ar2.length) {
    if (ar1[i] < ar2[j]) {
      merged.push(ar1[i++]);
    } else {
      merged.push(ar2[j++]);
    }
  }
  while (i < ar1.length) {
    merged.push(ar1[i++]);
  }
  while (j < ar2.length) {
    merged.push(ar2[j++]);
  }
  return merged;
};

// Convert sorted array to balanced BST
// let sortedArrayToBST = (arr, start = 0, end = arr.length - 1) => {
//   if (start > end) {
//     return null;
//   }
//   let mid = Math.floor((start + end) / 2);
//   let node = new TreeNode(arr[mid]);
//   node.left = sortedArrayToBST(arr, start, mid - 1);
//   node.right = sortedArrayToBST(arr, mid + 1, end);
//   return node;
// };

// Merge two BSTs
let merge = (root1, root2) => {
  let arr1 = inorder(root1);
  let arr2 = inorder(root2);
  let mergedArr = mergedArray(arr1, arr2);
  return mergedArr
};

// Example usage:
let root1 = new TreeNode(3);
root1.left = new TreeNode(1);
root1.right = new TreeNode(5);

let root2 = new TreeNode(4);
root2.left = new TreeNode(2);
root2.right = new TreeNode(6);

let mergedRoot = merge(root1, root2);
console.log(mergedRoot);
