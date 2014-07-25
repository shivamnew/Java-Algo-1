import java.io.File;
public class Queue<item> {

	public class node
	{
		item s;
		node next;
	}
	
	private node head=null;
	private node last=head;
	
	public boolean isEmpty()
	{return this.head==null;}
	public void enqueue(item str)
	{
		node dummy= new node();
		dummy=this.last;
		this.last.next=null;
		this.last.s=str;
		dummy.next=this.last;
	}
	public item dequeue()
	{
		item str;
		str=this.head.s;
		head=head.next;
		return str;
	}
	
	public void main(String[] args){
		File file=new File("this.txt");
	}
}
