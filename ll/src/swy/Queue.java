package swy;

import java.util.EmptyStackException;


public class Queue<T> {
	private LinkList<T> list=null;
	// 队尾下标，在插入中使用
	private Node<T> offerIndex =null;;

	// 队首下标,在删除中使用
	private Node<T> delIndex =null;
	
	
	public Queue() {
		list=new LinkList<>();
	}
	
	public int getSize(){
		Node<T> node=offerIndex;
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
		return getSize()<1;
	}
	/**
	 * 入队
	 * @param t
	 */
	public void offer(T t){
		list.insertLast(t);
		offerIndex=list.getFirst();
		delIndex=list.getLast();
	}
	/**
	 * 出队（删除队首元素）
	 * @return
	 */
	public T pop(){
		T t=null;
		if(getSize()>1){
			t=offerIndex.getData();
			offerIndex=offerIndex.getNext();
		}if(getSize()==1){
			t=offerIndex.getData();
			offerIndex=null;
		}if(getSize()==0){
			throw new EmptyStackException();
		}
		
		return t;
	}
	/**
	 * 获取队首元素，但不出队
	 * @return
	 */
	public T peek(){
		T t=null;
		if(getSize()>=1){
			t=offerIndex.getData();
		}if(getSize()==0){
			throw new EmptyStackException();
		}
		
		return t;
	}

}
