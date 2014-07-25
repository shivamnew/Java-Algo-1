
public class MergeSort {
	public static void merge(int[] arr,int[] aux,int min,int mid,int hi){
		for(int i=min;i<=hi;i++)aux[i]=arr[i];
		int l=min;int m=mid+1;int n=min;
		for(n=min;n<=hi;n++){
			//System.out.println("l is "+l+" m is "+m+" n is "+n);
			if(l>mid){arr[n]=aux[m++];}
			else if(m>hi){arr[n]=aux[l++];}
			else if(aux[l]<aux[m]){arr[n]=aux[l++];}
			else {arr[n]=aux[m++];}
			
		}
	}
	public static void bisect(int[] arr,int[] aux,int min,int hi){
	
		if(hi<=min) return;
		int mid=(min+hi)/2;
		bisect(arr,aux,min,mid);
		bisect(arr,aux,mid+1,hi);
		if(arr[mid]<arr[mid+1]) return;
		merge(arr,aux,min,mid,hi);
	
		}
	public static void bottom_up(int[] arr,int[] aux,int min,int hi){
		for(int sz=1;sz<arr.length;sz=2*sz)
		{
			for(int lo=0;lo<arr.length-1;lo=lo+sz+sz){
				merge(arr,aux,lo,lo+sz-1,Math.min(lo+sz+sz-1, arr.length-1));
			}
		}
	}
	
public static void main(String[] args){
	int[] arr=new int[10];
	int[] aux=new int[10];
	for(int i=0;i<10;i++){arr[i]=10-i;}
	bottom_up(arr,aux,0,9);
	for(int i=0;i<10;i++)System.out.print(arr[i]+" ");
}  
}
