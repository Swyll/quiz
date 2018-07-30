package swy;
/**
 * 作业1、（2，3）（7,5）（0.6）（9,3），找到距离原点最远的点
 *     2、这些点构成的最长线段
 *     3,、数组中连续子元素(空集，全是负数，0)的最大和
 *     [-1,4,2,-5,2,3,7,-20,9]
 */
public class Test {
	
	private static int k;

	public static boolean isContain(int[] m,int a){
		
		for (int i : m) {
			if(i==a){
				return true;
			}
		}
		
		return false;
	}
	
	public static int max(int[] a){
		int max=a[0];
		for(int i=1;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
			}
		}
		return max;
	}
	
	public static int fib(int n){
		k++;
		if(n<3)return 1;
		return fib(n-1)+fib(n-2);
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int[] m={21,4,5,7,9,11,23};
		int a=3;
		
		isContain( m,a);
		System.out.println(max(m));
		
		System.out.println(fib(15));
		System.out.println(k);
	}
	
	

}
