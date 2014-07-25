//import Quick;
import java.util.*;
public class TestQuickSort {
	public static void sort(int[] arr){
		Random rand = new Random();int k;
		for(int i=1;i<arr.length;i++){
			k=rand.nextInt(i+0);
			exchng(arr,i,k);
		}
		quick(arr,0,arr.length-1);
	}
	public static void quick(int[] arr,int min,int hi ){
		int pivot=arr[min + (hi-min)/2];
		int i=min;int j=hi;
		while(i<=j){
			while(pivot>arr[i])i++;
			while(pivot<arr[j])j--;
			if(i<=j){exchng(arr,i,j);i++;j--;}
		}
		if(min<j)quick(arr,min,j);
		if(i<hi)quick(arr,i,hi);
	}
	public static void exchng(int[] arr,int i,int j ){
		int dummy=arr[i];
		arr[i]=arr[j];
		arr[j]=dummy;
	}
public static void main(String[] args){
	int[] arr=new int[10];
	for(int i=0;i<arr.length;i++) arr[i]=10-i;
	sort(arr);
	for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
}
}
