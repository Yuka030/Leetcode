import java.util.ArrayList;
import java.util.List;

public class NAryTreePostorderTraversal_590 {
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
    public List<Integer> list = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        // base case
        if(root == null){
            return list;
        }

        // recursive case
        for(Node node: root.children){
            postorder(node);
        }

        list.add(root.val);
        return list;
    }
}
