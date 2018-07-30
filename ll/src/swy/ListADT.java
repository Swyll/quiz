package swy;

public interface ListADT<T> {
	
	//增加子元素
	void add(T t);
	
	//插入元素
	void insert(int index,T t);
	
	//获得指定位置元素
	T get(int index);
	
	//删除指定位置元素
	void remove(int index);

	//判断是否为空
	boolean isEmpty();
	
	//清空
	void clesr();
	
	//获得列表的大小
	int size();
	
}
