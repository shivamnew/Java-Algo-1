
public class BinaryTree<key extends Comparable<key>> {
	private key[] pq;
	private int n;
	
	public void maxpq(int capacity){
		pq=(key[]) new Comparable[capacity+1];}
	
	public boolean isEmpty(){
		return n==0;
	}
	public void insert(key p){
		pq[++n]=p;
		swim(n);
	}
	public key delmax(){
		key max=pq[1];
		exchng(1,n--);
		sink(1);
		pq[n+1]=null;
		return max;}
	
	public void swim(int k){
		while(k>1&&less(k/2,k)){exchng(k,k/2);k=k/2;}
	}
	public void sink(int k){
		while(2*k+1<n){
			int j=less(2*k,2*k+1)?(2*k+1):2*k;
			if(less(k,j)){exchng(k,j);
			k=j;} else break;
		}
	}
	
	private boolean less(int i,int j){
		return pq[i].compareTo(pq[j])<0;}
	private void exchng(int i,int j){key dummy=pq[i];
	pq[i]=pq[j];pq[j]=dummy;}

}
