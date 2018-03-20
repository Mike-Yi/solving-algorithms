package difficulty.medium;

import java.util.HashMap;
import java.util.Map;

import entities.TreeNode;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal s = new Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal();
		int[] preorder = new int[]{3,9,1,2,20,15,7};
		int[] inorder = new int[]{1,9,2,3,15,20,7};
		s.buildTree(preorder, inorder);
	}
	
	public TreeNode buildTree(int[] preorder, int[] inorder) {
	    Map<Integer, Integer> inMap = new HashMap<Integer, Integer>();

	    for(int i = 0; i < inorder.length; i++) {
	        inMap.put(inorder[i], i);
	    }

	    TreeNode root = buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inMap);
	    return root;
	}

	public TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> inMap) {
	    if(preStart > preEnd || inStart > inEnd) return null;

	    TreeNode root = new TreeNode(preorder[preStart]);
	    int inRoot = inMap.get(root.val);
	    int numsLeft = inRoot - inStart;

	    root.left = buildTree(preorder, preStart + 1, preStart + numsLeft, inorder, inStart, inRoot - 1, inMap);
	    root.right = buildTree(preorder, preStart + numsLeft + 1, preEnd, inorder, inRoot + 1, inEnd, inMap);

	    return root;
	}

}
