package swy;

public class TreeNode<T> {
	
	T data;
	TreeNode<T> lestChild=null;
	TreeNode<T> rightChild=null;
	
	public TreeNode() {

	}

	public TreeNode(T data, TreeNode<T> lestChild, TreeNode<T> rightChild) {
		this.data = data;
		this.lestChild = lestChild;
		this.rightChild = rightChild;
	}
	
	

}
