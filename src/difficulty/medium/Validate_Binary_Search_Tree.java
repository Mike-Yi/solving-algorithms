package difficulty.medium;

import entities.TreeNode;

public class Validate_Binary_Search_Tree {

	public static void main(String[] args) {
		Validate_Binary_Search_Tree s = new Validate_Binary_Search_Tree();
		TreeNode root =  new TreeNode(1);
		root.left = new TreeNode(2);
		s.isValidBST(root);

	}
	
    public boolean isValidBST(TreeNode root) {
        
        return isValidBST(root, null, null);
    }
    
    public boolean isValidBST(TreeNode root, Integer leftVal, Integer rightVal) {
        if(root == null) return true;
        
        if((rightVal == null || root.val < rightVal) && (leftVal == null || root.val > leftVal)) {
            return  isValidBST(root.left, leftVal, root.val) && isValidBST(root.right, root.val, rightVal);   
        } else {
            return false;
        }

    }

}
