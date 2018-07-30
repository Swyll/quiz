package swy;

public class Tree2Node<T> {
	
	T data;
	Tree2Node<T> child=null;
	Tree2Node<T> bro=null;
	
	public Tree2Node(T data, Tree2Node<T> child, Tree2Node<T> bro) {
		this.data = data;
		this.child = child;
		this.bro = bro;
	}

	

}
