package swy;

import java.util.ArrayList;
import java.util.List;
/*
 *     a
 *    / 
 */
public class Tree2<T> {
	
	Tree2Node<T> root;

	public Tree2(T data) {
		this.root=new Tree2Node<>(data,null,null);
	}
	
	public void out(Tree2Node<T> root){
		List<Tree2Node<T>> list=new ArrayList<>();
		list.add(root);
		while(root.bro!=null){
			root=root.bro;
			list.add(root);
		}
		for (Tree2Node<T> k : list) {
			System.out.println(k.data);
		}
		for (Tree2Node<T> t : list) {
			if(t.child!=null){
				out(t.child);
			}
		}
	}
	
	public static void main(String[] args) {
		Tree2<String> a=new Tree2<>("a");
		Tree2Node<String> b=new Tree2Node<>("b",null,null);
		Tree2Node<String> c=new Tree2Node<>("c",null,null);
		Tree2Node<String> d=new Tree2Node<>("d",null,null);
		Tree2Node<String> e=new Tree2Node<>("e",null,null);
		Tree2Node<String> f=new Tree2Node<>("f",null,null);
		Tree2Node<String> g=new Tree2Node<>("g",null,null);
		Tree2Node<String> h=new Tree2Node<>("h",null,null);
		Tree2Node<String> i=new Tree2Node<>("i",null,null);
		Tree2Node<String> j=new Tree2Node<>("j",null,null);
		Tree2Node<String> k=new Tree2Node<>("k",null,null);
		
		a.root.child=b;
		b.bro=c;
		c.bro=d;
		b.child=e;
		e.bro=f;
		f.bro=g;
		c.child=h;
		d.child=i;
		i.bro=j;
		j.child=k;
		
		a.out(a.root);
	}
	

}
