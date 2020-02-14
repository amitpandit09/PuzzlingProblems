package amazon;
/*
Binary search tree (BST) is a binary tree where the value of each node is larger or equal to the values in all the nodes in that node's left subtree and is smaller than the values in all the nodes in that node's right subtree.
Write a function that checks if a given binary search tree contains a given value.
For example, for the following tree:
n1 (Value: 1, Left: null, Right: null)
n2 (Value: 2, Left: n1, Right: n3)
n3 (Value: 3, Left: null, Right: null)
Call to contains(n2, 3) should return true since a tree with root at n2 contains number 3.
 */

class Node{
	public int value;
	public Node left,right;
	public Node(int val,Node left,Node right) {
		this.value=val;
		this.left=left;
		this.right=right;
	}
}
public class BinarySearchTree {
	public static void main(String[] args) {
		Node left=new Node(1,null,null);
		Node right=new Node(3,null,null);
		Node root=new Node(2,left,right);
		System.out.println(searchElement(root,2));
	}
	
	private static boolean searchElement(Node root,int value) {
		if(root==null) {
			return false;
		}
		
		if(root.value==value) {
			return true;
		}
		else if(value<root.value) {
			return searchElement(root.left,value);
		}else if(value>root.value) {
			return searchElement(root.right,value);
		}
		return false;
	}
}
