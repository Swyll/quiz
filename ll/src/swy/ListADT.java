package swy;

public interface ListADT<T> {
	
	//������Ԫ��
	void add(T t);
	
	//����Ԫ��
	void insert(int index,T t);
	
	//���ָ��λ��Ԫ��
	T get(int index);
	
	//ɾ��ָ��λ��Ԫ��
	void remove(int index);

	//�ж��Ƿ�Ϊ��
	boolean isEmpty();
	
	//���
	void clesr();
	
	//����б�Ĵ�С
	int size();
	
}
