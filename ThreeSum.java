import java.util.*;
public class ThreeSum {

	int num=8;
	int[] arr= new int[num];
	@SuppressWarnings("resource")
	public ThreeSum()
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the array of 8 elements");
		for(int i=0;i<num;i++)
		{
			arr[i]=in.nextInt();
		}
	}
public static int count(int arr[]){
	int len=arr.length;
	int count=0;
	for(int i=0;i<len;i++)
	{
		for(int j=i+1;j<len;j++)
		{
			for(int k=j+1;k<len;k++)
			{
				if(arr[i]+arr[j]+arr[k]==0)
					{//System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+"\n");
					count++;}
			}
		}
	}
	return count;
}

public static void main(String[] args){
	ThreeSum obj = new ThreeSum(); 
	int out=count(obj.arr);
	System.out.println("the number of triplets is "+out);
}
}
