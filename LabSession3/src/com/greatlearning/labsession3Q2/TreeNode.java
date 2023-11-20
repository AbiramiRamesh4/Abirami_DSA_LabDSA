package com.greatlearning.labsession3Q2;

public class TreeNode {
	int data;
	TreeNode left;
	TreeNode Right;
	public TreeNode(int data) {
		this.data = data;
		this.left = this.Right = null;
		
	}
	public TreeNode insert(TreeNode root, int data) {
		if (root == null) {
			return new TreeNode(data);
		}
		if(data<root.data) {
			root.left = insert(root.left, data);
		}else {
			root.Right = insert(root.Right, data);
		}
		return root;
	}

}
