package difficulty.medium;

import java.util.LinkedList;
import java.util.Queue;

import entities.TreeNode;

public class Flatten_Binary_Tree_to_Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public void flatten(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        putInQ(root, q);
        TreeNode head = q.poll();
        head.left = null;
        head.right = null;
        while(!q.isEmpty()){
            head.right = q.poll();
            head = head.right;
            head.left = null;
            head.right = null;
        }
        
    }
    
    public void putInQ(TreeNode root, Queue<TreeNode> q) {
        if(root == null) {
             return;
        }
        
        q.add(root);
        putInQ(root.left, q);
        putInQ(root.right, q);
        
    }

}
