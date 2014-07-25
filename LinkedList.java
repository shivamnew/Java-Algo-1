public class LinkedList {
	private Node first=null;
private class Node
{
	String item;
	Node next;
	}

public void push(String s)
{
	Node newNode = new Node();
	newNode.item=s;
	newNode.next=first;
	first=newNode;
}
public boolean isEmpty()
{
	return first==null;}

public String pop()
{
	String old=first.item;
	first=first.next;
	System.out.println(old);
	return old;
	}
}

