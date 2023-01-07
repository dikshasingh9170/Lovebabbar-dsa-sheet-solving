package BinaryTree;

public class BinaryTree3 {
    
}
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);int height=0;
        while(!q.isEmpty()){
            int size=q.size();
            height++;
            List<Integer> currlevel=new ArrayList<>();
            while(size-->0){
                TreeNode curr=q.poll();
                currlevel.add(curr.val);
                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
            }
        }
        return height;
    }
}
