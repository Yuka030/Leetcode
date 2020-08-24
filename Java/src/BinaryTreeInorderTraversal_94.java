import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal_94 {
    /**
     * Definition for a binary tree node.
     *
     **/
      public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
        TreeNode(int x) { val = x; }
     }

    public List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        // base case
        if(root == null){
            return list;
        }

        //recursive case
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);

        return list;
    }
}
