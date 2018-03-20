package difficulty.medium;

import java.util.HashMap;

import entities.TreeNode;

public class House_Robber_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int rob(TreeNode root) {
        return robb(root, new HashMap<TreeNode, Integer>());
    }
    
    public int robb(TreeNode root, HashMap<TreeNode, Integer> map) {
        if(root == null)  return 0;
        if(map.containsKey(root)) return map.get(root);
        
        int val = root.val;
        if(root.left != null) {
            val += robb(root.left.left ,map) + robb(root.left.right, map);
        }
        
        if(root.right != null) {
            val += robb(root.right.left,map) + robb(root.right.right ,map);
        }
        
        val = Math.max(robb(root.left,map) +  robb(root.right ,map) , val);
        map.put(root, val);

        return val;        
    }

}
