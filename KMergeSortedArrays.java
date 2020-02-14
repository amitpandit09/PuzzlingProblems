package amazon;

import java.util.PriorityQueue;

public class KSortedArrays {
	public static void main(String[] args) {
		int[][] arr= {
				{1,10,11,15},
				{2,4,9,14},
				{5,6,8,16},
				{3,7,12,13},{}
		};
		
		mergeKSorted(arr);
		/*for(int i=0;i<mergeKSorted(arr).length;i++) {
			System.out.println()
		}*/
	}
	

	private static int[] mergeKSorted(int[][] arrays) {
		if(arrays==null) {
			return new int[0];
		}
		
		int total_size=0;
		PriorityQueue<Element> pq=new PriorityQueue<Element>((n1,n2)-> n1.val-n2.val);
		
		for(int i=0;i<arrays.length;i++) {
			if(arrays[i].length>0) {
				Element element=new Element(i,0,arrays[i][0]);
				pq.offer(element);
				
			}
			total_size += arrays[i].length;
		}
		
		int[] result=new int[total_size];
		int index=0;
		while(!pq.isEmpty()) {
				Element curr=pq.poll();
				result[index]=curr.val;
				System.out.println(""+result[index]);
				index++;
				if(curr.col+1<arrays[curr.row].length) {
					curr.col+=1;
					curr.val = arrays[curr.row][curr.col];
					pq.offer(curr);
				}
		}
		return result;
	}
}

class Element{
	int row,col,val;
	public Element(int row,int col,int val){
		this.row=row;
		this.col=col;
		this.val=val;
	}

}
