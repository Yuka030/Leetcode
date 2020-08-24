/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */

let maxLevel;
let sum;

var deepestLeavesSum = function (root) {
  maxLevel = 0;
  sum = 0;

  find(root, 0);
  console.log(sum);
  return sum;
};

const find = function (root, level) {
  if (root === null) {
    return;
  }

  if (level > maxLevel) {
    maxLevel = level;
    sum = root.val;
  } else if (level === maxLevel) {
    sum += root.val;
  }

  find(root.left, level + 1);
  find(root.right, level + 1);
};
