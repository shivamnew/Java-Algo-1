
public class Threeway {
	public static void sort(Comparable[] arr,int lo,int hi){
		if(hi<=lo)return;
		int lt=lo;int gt=hi;
		Comparable v=arr[lo];
		int i=lo;
		while(i<=gt){
			int cmp=arr[i].compareTo(v);
			if (cmp<0)exchng(arr,lt++,i++);
			else if (cmp>0)exchng(arr,gt--,i);
			else i++;
		}
		sort(arr,lo,lt-1);
		sort(arr,gt+1,hi);
	}
	public static void exchng(Comparable[] arr,int i,int j){
		Comparable dummy=arr[i];
		arr[i]=arr[j];
		arr[j]=dummy;
	}
	public static void main(String[] args){
		Comparable[] arr= new Comparable[10];
		for(int i=0;i<arr.length;i++) arr[i]=(10-i);
		sort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
	}

}
