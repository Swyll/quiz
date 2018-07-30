package swy;

import java.util.Scanner;

public class HashTable {
	
	LinkList<String>[] hashTable=new LinkList[26];

	public HashTable() {
		
		for(int i=0;i<hashTable.length;i++){
			hashTable[i]=new LinkList<>();
		}
		
	}
	
	public void add(int index,String data){
		LinkList<String> ll=hashTable[index];
		boolean haveData=ll.findData(data);
		if(haveData){
			System.out.println("hashTable里面已经有数据！！");
		}else{
		ll.insertFirst(data);
		}
	}

	public LinkList[] getHashTable() {
		return hashTable;
	}

	public void setHashTable(LinkList[] hashTable) {
		this.hashTable = hashTable;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashTable htable=new HashTable();
		while(true){
		System.out.println("请输入单词:");
		String p=sc.next();
		int index=p.charAt(0)-97;
		htable.add(index, p);
		}

	}
	

}
