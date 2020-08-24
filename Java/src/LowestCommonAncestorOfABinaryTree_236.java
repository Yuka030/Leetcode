import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestorOfABinaryTree_236 {
    /**
     * Definition for a binary tree node.
     **/
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    '}';
        }
    }

    List<TreeNode> path1 = new ArrayList<>();
    List<TreeNode> path2 = new ArrayList<>();

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode lca = null;

        if(findPath(root, p, path1) && findPath(root, q, path2)){
            if(path1.isEmpty() || path2.isEmpty()){
                if(path1.isEmpty()) System.out.println("path1 is empty (no value found in the tree)");
                if(path2.isEmpty()) System.out.println("path2 is empty (no value found in the tree)");
                return lca;
            }

            // System.out.println("path1 is " + path1);
            // System.out.println("path2 is " + path2);

            for(int i = 0; i < path1.size() && i < path2.size(); i++){
                if(path1.get(i).equals(path2.get(i))){
                    lca = path1.get(i);
                }
            }
        }

        //System.out.println("lca val is " + lca.val);
        return lca;
    }

    public boolean findPath(TreeNode root, TreeNode target, List<TreeNode> path){
        int val = target.val;
        //basecase
        if(root == null) return false;

        path.add(root);
        if(root.val == val) return true;

        if(root.left != null && findPath(root.left, target, path)){
            return true;
        }

        if(root.right != null && findPath(root.right, target, path)){
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }
}
