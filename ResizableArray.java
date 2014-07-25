
public class ResizableArray {
	private String[] s= new String[1];
	private int N=0;

	private void resize(int newSize)
	{
		String[] copy = new String[newSize];
		for(int i=0;i<this.s.length;i++)
		{
			copy[i]=this.s[i];
		}
		this.s=copy;
	}
	
	public void push(String str)
	{
		if(N==this.s.length) resize(2*this.s.length);
		this.s[N++]=str;
	}
	
	public String pop()
	{
		String arr=this.s[--N];
		this.s[N]=null;
		if(N==this.s.length/4) resize(this.s.length/2);
		return arr;
	}
}
