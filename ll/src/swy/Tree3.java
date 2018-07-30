package swy;

//二叉搜索树
public class Tree3 {
	
	TreeNode<Integer> root=null;

	public Tree3(int e) {
		this.root=new TreeNode<Integer>(e,null,null);
	}
	
	public Tree3() {
	}
	
	public void insert(int e){
		root=insert(e,root);
	}
	
	
	//插入二叉搜索树
	//传的是个空地址所以会显示空指针异常
	public TreeNode<Integer> insert(int e,TreeNode<Integer> root){
		if(root==null){
			return new TreeNode<Integer>(e,null,null);
		}if(e<root.data){
			root.lestChild=insert(e,root.lestChild);
		}if(e>root.data){
			root.rightChild=insert(e,root.rightChild);
		}
		
		return root;
	}
	
	public void p(int e,TreeNode<Integer> root){
		if(root==null){
			root=new TreeNode<Integer>(e,null,null);
		}
	}
	
	// 先序遍历
		public void first(TreeNode<Integer> root) {
			System.out.println(root.data);
			if (root.lestChild != null) {
				first(root.lestChild);
			}
			if (root.rightChild != null) {
				first(root.rightChild);
			}
		}

		// 中序遍历
		public void middle(TreeNode<Integer> root) {
			if (root.lestChild != null) {
				middle(root.lestChild);
			}
			System.out.println(root.data);
			if (root.rightChild != null) {
				middle(root.rightChild);
			}
		}
		
		public void b(int a){
			a=a+3;
		}

		// 后序遍历
		public void last(TreeNode<Integer> root) {
			if (root.lestChild != null) {
				last(root.lestChild);
			}
			if (root.rightChild != null) {
				last(root.rightChild);
			}
			System.out.println(root.data);
		}
	
	public static void main(String[] args) {
		Tree3 tree3=new Tree3(6);

//		tree3.insert(4);
//		tree3.insert(8);
//		tree3.insert(2);
//		tree3.insert(3);
//		tree3.insert(8);
//		tree3.insert(7);
//		tree3.insert(10);
//		tree3.first(tree3.root);
		int a=5;
		tree3.b(a);
		System.out.println(a);
	}
	

}
