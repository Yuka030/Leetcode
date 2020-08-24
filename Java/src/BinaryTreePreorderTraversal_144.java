import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal_144 {
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

    public List<Integer> preorderTraversal(TreeNode root) {

        //base case
        if(root == null){
            return list;
        }

        //recursive case
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return list;
    }
}
