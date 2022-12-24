package Binary search tree;
import java.util.*;
class BST_1 {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return null;
        }
        while(root!=null){
            if(root.val==val){
                return root;
            }
            else if(root.val<val){
                root=root.right;
            }
            else if(root.val>val){
                root=root.left;
            }
        }
        return null;
    }
    public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
              TreeNode() {}
              TreeNode(int val) { this.val = val; }
              TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
             }
        }
}
