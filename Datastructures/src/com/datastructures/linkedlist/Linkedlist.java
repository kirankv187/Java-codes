package com.datastructures.linkedlist;

public class Linkedlist 
{
	private  SingleNode headNode=null;
	private  SingleNode tailnode=null;
	private int size=0;
	
	public Linkedlist(int valuesTobeInserted)
	{
		SingleNode node = new SingleNode();
		node.setValue(valuesTobeInserted);
		node.setNext(null);
		headNode= node;
		tailnode=node;
		setSize(1);
	}
	
	public void insert(int valuestobeinserted,int location)
	{
		SingleNode node= new SingleNode();
		node.setValue(valuestobeinserted);
		if(!existsLinkedList())
		{
			System.out.println("linkedlist does not exist");
			return;
		}
		else if(location == 0)
		{
			node.setNext(headNode);
			headNode=node;
		}
		else if(location >=size)
		{
			node.setNext(null);
			tailnode.setNext(node);
			tailnode=node;
		}
		else
		{
			SingleNode tempNode = headNode;
			int index=0;
			while(index < location-1)
			{
				tempNode = tempNode.getNext();
				index++;
			}
			SingleNode newnode = tempNode.getNext();
			tempNode.setNext(node);
			node.setNext(newnode);
		}
		setSize(getSize()+1);
	}
	public void traversalLinkedList()
	{
		if(!existsLinkedList())
		{
			System.out.println("linked list does not exist");
			return;
				}
		else
		{
			SingleNode tempNode = headNode;
			for(int i=0;i<getSize();i++)
			{

				System.out.println("value at location : "+i+ "is : " +tempNode.getValue());
			tempNode = tempNode.getNext();
			}
		}
	}
	public void search(int valuetobesearch)
	{
		if(! existsLinkedList())
		{
			System.out.println("linked ");
			return;
			
		}else
		{
			SingleNode tempNode=headNode;
			for(int i=0;i<getSize();i++)
			{
				if(tempNode.getValue()== valuetobesearch)
				{
					System.out.println("value found at "+i);
				return;
				}
				tempNode = tempNode.getNext();
			} System.out.println("value nf");
		}
	}
	
	public void delete(int location)
	{
		if(! existsLinkedList())
		{
			System.out.println("linked ");
			return;
			
		} 
		else if(location ==0)
		{
			headNode = headNode.getNext();
			if(headNode == null)
			{
				tailnode = null;
			}
			setSize(getSize() -1);
		}
		else if(location >= size)
		{
			SingleNode tempnode = headNode;
			for(int i=0;i<getSize()-1;i++)
			{
				tempnode = tempnode.getNext();
			}
			if(tempnode == headNode)
				headNode = tailnode = null;
		tempnode.setNext(null);
		tailnode = tempnode;
		setSize(getSize() -1);
		}
		else {
			SingleNode tempNode = headNode;
			for(int i=0;i<location-1;i++)
			{
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(tempNode.getNext().getNext());
			setSize(location);
		}
		}
	
	
	public boolean existsLinkedList()
	{
		return headNode!=null;
	}
	public SingleNode getHeadNode()
	{
		return headNode;
	}
	public void setHeadNode(SingleNode headNode)
	{
		this.headNode = headNode;
	}
	public SingleNode getTailnode() 
	{
		return tailnode;
	}
	public void setTailnode(SingleNode tailnode)
	{
		this.tailnode = tailnode;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}
