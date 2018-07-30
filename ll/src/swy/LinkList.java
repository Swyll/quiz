package swy;


public class LinkList<T> {

	private Node<T> first=null;
	private Node<T> last=null;
	
	/**
	 * ��ñ���Ԫ�ظ���
	 * @return
	 */
	public int getSize(){
		if(first!=null){
			int count=1;
			Node<T> next=first.getNext();
			while(next!=null){
			    next=next.getNext();
			    count++;
			}
			return count;
		}
		return 0;
	}
	
	/**
	 * ��ͷ����������
	 * @param data
	 */
	public void insertFirst(T data){
		Node<T> node=new Node<>();
		node.setData(data);
		if(getSize()==0){
			last=node;
		}
		node.setNext(first);
		first=node;

		System.out.println("����ɹ�������");
	}
	/**
	 * ��β����������
	 * @param data
	 */
	public void insertLast(T data){
		Node<T> node=new Node<T>();
		node.setData(data);
		if(getSize()==0){
			first=node;
		}else{
		    last.setNext(node);
		}
		last=node;
		System.out.println("����ɹ�������");
	}
	
	/**
	 * ɾ��ͷԪ������
	 */
	public void deleteFirst(){
		if(first!=null){
		   first=first.getNext();
		}
	}
	
	public Node<T> getFirst(){
		return first;
	}	
	
	public Node<T> getLast(){
		return last;
	}
	
	/**
	 * ������
	 * @return
	 */
	public boolean findData(T data){
		Node e=first;
		while(e!=null){
			if(data.equals(e.getData()) ){
				return true;
			}
			e=e.getNext();
		}
		
		return false;
	}
	
	public String tostring(){
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		Node<T> node=first;
		while(node!=null){
			sb.append(node.getData()+",");
			node=node.getNext();
		}
		if(sb.length()>1){
		    sb.deleteCharAt(sb.length()-1);
		}
		sb.append("]");
		
		return sb.toString();
	}
}
