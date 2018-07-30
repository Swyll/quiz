package swy;

public class Tree<T> {

	TreeNode<T> root;

	public Tree(T data) {
		this.root = new TreeNode<>(data, null, null);
	}

	// 先序遍历
	public void first(TreeNode<T> root) {
		System.out.println(root.data);
		if (root.lestChild != null) {
			first(root.lestChild);
		}
		if (root.rightChild != null) {
			first(root.rightChild);
		}
	}

	// 中序遍历
	public void middle(TreeNode<T> root) {
		if (root.lestChild != null) {
			middle(root.lestChild);
		}
		System.out.println(root.data);
		if (root.rightChild != null) {
			middle(root.rightChild);
		}
	}

	// 后序遍历
	public void last(TreeNode<T> root) {
		if (root.lestChild != null) {
			last(root.lestChild);
		}
		if (root.rightChild != null) {
			last(root.rightChild);
		}
		System.out.println(root.data);
	}

	// 反转二叉树
	public void reversal(TreeNode<T> root) {
		TreeNode<T> e;
		if (root.lestChild != null) {
			reversal(root.lestChild);
		}
		if (root.rightChild != null) {
			reversal(root.rightChild);
		}
		e = root.lestChild;
		root.lestChild = root.rightChild;
		root.rightChild = e;
	}

	// 二叉搜索树插入
	public TreeNode<Integer> insert(TreeNode<Integer> root, int e) {
		if (root == null) {
			return new TreeNode<Integer>(e, null, null);
		}
		if (e < root.data) {
			root.lestChild = insert(root.lestChild, e);
		}
		if (e > root.data) {
			root.rightChild = insert(root.rightChild, e);
		}

		return root;
	}
	
	public int max(TreeNode<Integer> root){
		if(root.rightChild==null){
			return root.data;
		}
		return max(root.rightChild);
	}
	
	public int min(TreeNode<Integer> root){
		if(root.lestChild==null){
			return root.data;
		}
		return min(root.lestChild);
	}
	
	//查找元素
	public boolean find(TreeNode<Integer> root,int e){
		if(e==root.data){
			return true;
		}
		if(e<root.data){
			find(root.lestChild,e);
		}
		if(e>root.data){
			find(root.rightChild,e);
		}
		
		return false;
	}

	public static void main(String[] args) {
		Tree<String> a = new Tree<>("a");
		TreeNode<String> k = new TreeNode<>("k", null, null);
		TreeNode<String> j = new TreeNode<>("j", null, null);
		TreeNode<String> i = new TreeNode<>("i", null, null);
		TreeNode<String> d = new TreeNode<>("d", null, null);
		TreeNode<String> f = new TreeNode<>("f", null, null);
		TreeNode<String> g = new TreeNode<>("g", null, null);
		TreeNode<String> h = new TreeNode<>("h", null, null);
		TreeNode<String> c = new TreeNode<>("c", null, null);
		TreeNode<String> b = new TreeNode<>("b", null, null);

		a.root.lestChild = b;
		a.root.rightChild = c;
		b.lestChild = d;
		b.rightChild = f;
		d.lestChild = i;
		d.rightChild = j;
		c.lestChild = g;
		c.rightChild = h;
		h.rightChild = k;

		a.first(a.root);
		System.out.println("--------------------------");
		a.middle(a.root);
		System.out.println("--------------------------");
		a.last(a.root);

		a.reversal(a.root);
		System.out.println("----------反转二叉树-------");
		a.first(a.root);
		System.out.println("--------------------------");
		a.middle(a.root);
		System.out.println("--------------------------");
		a.last(a.root);
	}

}
