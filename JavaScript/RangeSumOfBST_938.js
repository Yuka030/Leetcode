/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} L
 * @param {number} R
 * @return {number}
 */
var rangeSumBST = function (root, L, R) {
  // base case
  if (root === null) {
    return 0;
  }

  //recursive case
  if (root.val < L) {
    return rangeSumBST(root.right, L, R);
  } else if (root.val > R) {
    return rangeSumBST(root.left, L, R);
  } else {
    return (
      root.val + rangeSumBST(root.right, L, R) + rangeSumBST(root.left, L, R)
    );
  }
};
