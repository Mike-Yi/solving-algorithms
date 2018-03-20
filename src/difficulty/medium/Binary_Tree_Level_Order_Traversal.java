package difficulty.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import entities.TreeNode;

public class Binary_Tree_Level_Order_Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        List<Integer> list;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
           
        while(!q.isEmpty()) {
            int queueSize = q.size();
            list = new ArrayList<>();
            for(int i = 0; i < queueSize ; i++) {
                TreeNode temp = q.poll();   
                list.add(temp.val);
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right); 
            }
            res.add(list);
        }
        return res;
    }

}
