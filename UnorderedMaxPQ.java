
public class UnorderedMaxPQ<key extends Comparable<key>> {
	private key[] pq;
	private int n;
	
	public UnorderedMaxPQ(int capacity){
		pq=(key[]) new Comparable[capacity];}
	
	public boolean isEmpty(){return n==0;}
	
	public void insertkey(key x){
		pq[n++]=x;	}
	public key delMax(){
		int max=0;
		for(int i=0;i<n;i++)
			if(less(max,i)) max=i;
		exchng(max,n-1);
		return(pq[--n]);
	}
	public void exchng(int i,int j){key dummy=pq[i];pq[i]=pq[j];pq[j]=dummy;}
	public boolean less(int i,int j){ int p=pq[i].compareTo(pq[j]); if(i==-1)return true;else return false;}
}
