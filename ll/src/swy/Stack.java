package swy;

import java.util.EmptyStackException;


public class Stack<T> {
	private LinkList<T> list=null;
	private Node top=null;
	
	public Stack() {
		list=new LinkList<>();
	}
	
	public int getSize(){
		Node<T> node=top;
		if(list.getSize()!=0){
		   int count=0;
		   while(node!=null){
			   count++;
			   node=node.getNext();
		   }
		   return count;
		}
		return 0;
	}
	public boolean isEmpty(){
		return getSize()<=0;
	}
	
	/**
	 * 入栈
	 * @param t
	 */
	public void push(T t){
		list.insertFirst(t);
		top=list.getFirst();
	}
	/**
	 * 出栈
	 * @return
	 */
	public T pop(){
		Object t=null;
		if(getSize()>1){
			t=top.getData();
			top=top.getNext();
		}if(getSize()==1){
		    t=top.getData();
			top=null;
		}if(getSize()==0){
			throw new EmptyStackException();
		}
			
		return (T)t;
		
	}
	/**
	 * 获取栈顶元素
	 * @return
	 */
	public T peek(){
		Object t=null;
		if(getSize()>=1){
			t=top.getData();
		}if(getSize()==0){
			throw new EmptyStackException();
		}
			
		return (T)t;
	}
	
}
