package swy;

public class PriorityQueue {

	private int maxsize;
	private int[] queue;
	private int p;

	public PriorityQueue(int maxsize) {
		this.maxsize = maxsize;
		queue = new int[this.maxsize];
		p = 0;
	}

	public void insert(int value) {

		int i;
		if (p == 0) {
			queue[p++] = value;
		} else {
			for ( i = p-1; i >=0; i--) {
				if (value < queue[i]) {
						queue[i+1] = queue[i];
				}else{
					break;
				}
				
			}
			queue[i+1] = value;
			p++;

		}
	}

	
	
	public void out() {
		for (int i = 0; i < p; i++) {
			System.out.println(queue[i]);
		}
	}
	
	public static void main(String[] args) {
		PriorityQueue queue=new PriorityQueue(10);
		queue.insert(10);
		queue.insert(9);
		queue.insert(8);
		queue.insert(7);
		queue.insert(6);
		queue.insert(4);
		queue.insert(2);
		queue.insert(5);
		queue.insert(3);
		queue.insert(1);
		queue.out();
	}

}
