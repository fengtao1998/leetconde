
 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
 
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return compure(root.left,root.right)
        
    }

    private boolean compure(TreeNode left, TreeNode right) {
        if(left==null&&right==null) return true;
        if(left==null||right==null) return false;
        return (left.val==right.val)&&compure(left.left,right.right)&&compure(left.right,right.left);
    }
}