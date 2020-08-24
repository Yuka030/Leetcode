import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal_145 {
    /**
     * Definition for a binary tree node.
     **/
      public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }

    public List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        //base case
        if(root == null){
            return list;
        }

        //recursive case
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);

        return list;
    }
}
