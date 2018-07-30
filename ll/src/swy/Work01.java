package swy;

import java.util.ArrayList;
import java.util.List;
/*
 * 1、（2，3）（7,5）（0.6）（9,3），找到距离原点最远的点
 *     2、这些点构成的最长线段
 */
public class Work01 {
	public static void main(String[] args) {
		
		List<Point> list=new ArrayList<>();
		Point p1=new Point(2,3);
		list.add(p1);
		Point p2=new Point(7,5);
		list.add(p2);
		Point p3=new Point(0,6);
		list.add(p3);
		Point p4=new Point(9,3);
		list.add(p4);
		
		Point max=findPoint(list);
		System.out.println("距离原点最远的点为：");
		System.out.println("("+max.getX()+","+max.getY()+")");
		
		List<Point> l=max(list);
		
		System.out.println("这些点构成的最长线段的两点为：");
		for (Point point : l) {
			System.out.println("("+point.getX()+","+point.getY()+")");
		}
	}
	
	public static Point findPoint(List<Point> list){
		
		Point max=new Point(0,0);
		for (Point p : list) {
			if((p.getX()*p.getX()+p.getY()*p.getY())>=(max.getX()*max.getX()+max.getY()*max.getY())){
				max=p;
			}
		}
		
		return max;
	}
	
	public static List<Point> max(List<Point> list){
		
		List<Point> max=new ArrayList<>();
		Point a1=new Point(0,0);
		Point a2=new Point(0,0);
		int count=p(a1,a2);
		max.add(a1);
		max.add(a2);
		int length=list.size();
		for(int i=0;i<length-1;i++){
			for(int j=i;j<length;j++){
				if(p(list.get(i),list.get(j))>=count){
					count=p(list.get(i),list.get(j));
					max.remove(0);
					max.remove(0);
					max.add(list.get(i));
					max.add(list.get(j));
				}
			}
		}
		
		return max;
	}
	
	public static int p(Point a1,Point a2){
		
		int count=(a1.getX()-a2.getX())*(a1.getX()-a2.getX())+(a1.getY()-a2.getY())*(a1.getY()-a2.getY());
		return count;
	}

}
