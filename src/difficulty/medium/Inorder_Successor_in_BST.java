package difficulty.medium;

import entities.TreeNode;

public class Inorder_Successor_in_BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    TreeNode res;
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        res = new TreeNode(Integer.MAX_VALUE);
        inorder(root, p);
        return (res.val == Integer.MAX_VALUE)? null : res;
    }
    
    public void inorder(TreeNode root, TreeNode p){
        if(root == null) return;
        inorder(root.left, p);
        if(root.val > p.val) {
            res = (res.val < root.val) ? res : root;
        }
        inorder(root.right, p);
    }

}
