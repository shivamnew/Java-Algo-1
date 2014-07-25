
public class Heap<key extends Comparable<key>> {
	private key[] pq;
	private int n;
	
	public void sink(Comparable[] arr,int start,int end){
		int k=start;
		while(2*k+1<end){
			int j=less(arr,2*k,2*k+1)?(2*k+1):2*k;
			if(less(arr,k,j)){exchng(arr,k,j);
			k=j;} else break;
		}
	}
	public void sort(Comparable[] pq){
		int k,i;
		for(k=n/2;k>=0;k--){
			sink(pq,k,n);
		}
		while(n>0){
			exchng(pq,0,n--);
			sink(pq,0,n);
		}
	}
	
	public void exchng(Comparable[] pq,int i,int j){
		key dummy= (key) pq[j]; pq[j]=pq[i];pq[i]=dummy;
	}
	public boolean less(Comparable[] pq,int i,int j){
		return (pq[i].compareTo(pq[j])<0);}

}
