package com.greatlearning.labsession3Q2;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root = new TreeNode(40);
		root.insert(root, 20);
		root.insert(root, 60);
		root.insert(root, 10);
		root.insert(root, 30);
		root.insert(root, 50);
		root.insert(root, 70);
		
		FindingSumPair sumPair =new FindingSumPair();
		sumPair.CheckPairPresent(root, 30);

	} 

}
