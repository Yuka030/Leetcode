import java.util.ArrayList;

public class LeafSimilarTrees_872 {
    /**
     * Definition for a binary tree node.
     *
     * */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    ArrayList<Integer> array01 = new ArrayList<>();
    ArrayList<Integer> array02 = new ArrayList<>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        treeTraverse(array01, root1);
        treeTraverse(array02, root2);

        if(array01.size() != array02.size()) return false;
        for(int i = 0; i < array01.size(); i++){
            if(array01.get(i) != array02.get(i)) return false;
        }
        return true;
    }

    static void treeTraverse(ArrayList<Integer> array, TreeNode node){
        if(node == null) return;
        if(node.left == null && node.right == null){
            array.add(node.val);
            return;
        }
        treeTraverse(array, node.left);
        treeTraverse(array, node.right);
    }
}


