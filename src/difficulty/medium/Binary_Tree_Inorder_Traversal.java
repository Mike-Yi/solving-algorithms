package difficulty.medium;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import entities.TreeNode;

public class Binary_Tree_Inorder_Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        
        while(current != null || !stack.isEmpty()) {
            while(current != null){
                stack.push(current);
                current = current.left;
            }
            TreeNode temp = stack.pop();
            list.add(temp.val);
            current = temp.right;
        }
        return list;
    }
	/*
	//Recursive solution
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        inorderTraversal(list , root);
        return list;
    }
    
    public void inorderTraversal(List<Integer> list, TreeNode root) {
        if(root == null) return ;
        
        inorderTraversal(list, root.left);
        list.add(root.val);
        inorderTraversal(list, root.right);
        
    }
    */

}
