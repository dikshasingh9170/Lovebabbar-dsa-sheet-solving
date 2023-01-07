package BinaryTree;
import java.util.*;
public class BinaryTree1 {
}
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> currlevel=new ArrayList<>();
            while(size-->0){
                TreeNode curr=q.poll();
                currlevel.add(curr.val);
                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
            }
            res.add(currlevel);
        }
        return res;
    }
}