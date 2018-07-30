package swy;

public class ArrayList<T> implements ListADT<T> {
	
	Object[] data=new Object[3];
	int size=0;

	@Override
	public void add(T t) {
		data[size]=t;
		size++;
	}

	@Override
	public void insert(int index, T t) {
		if(index>=size){
			throw new ArrayIndexOutOfBoundsException();
		}
		add(get(size-1));
		for(int i=index;i<size;i++){
			
		}
		
	}

	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public void remove(int index) {
		// TODO Auto-generated method stub
		
	}

	public boolean isEmpty() {
		if(data.length==0)return true;
		return false;
	}

	public void clesr() {
		// TODO Auto-generated method stub
		
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}


}
