package difficulty.medium;

import entities.TreeNode;

public class Minimum_Distance_Between_BST_Nodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    int res = Integer.MAX_VALUE;
    Integer preVal = null;
    public int minDiffInBST(TreeNode root) {
        helper(root);
        return res;
    }
    
    public void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);
        if(preVal != null) res = Math.min(res, root.val - preVal);
        preVal = root.val;
        helper(root.right);
    }
	
}
