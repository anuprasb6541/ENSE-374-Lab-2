package SingleListElement;

public class ListElement
{
	private int data;
	public ListElement next;
	
	
	public ListElement()
	{
		
		this.next=null;
		this.data=0;
		
	}
	
	public void putData(int data)
	{
		
		this.datadata;
		
	}
	
	public int returnData()
	{
		
		return this.data;
		
	}
	
	public void insertElement(ListElement le)
	{
		
		le.next=this;
		
	}
	
	public ListElement returnElement(int index)
	{
		
		ListElement pointer = new ListElement();
		
		pointer = this;
		
		for(int i=0; i<index; i++)
		{
			
			pointer = pointer.next;
			
		}
		
		return pointer;
	}
	
	public ListElement deleteElement(int index)
	{
		
		ListElement pointer = new ListElement();
		
		pointer = this;
		
		for(int i=0;i<index;i++)
		{
			
			pointer = pointer.next;
			
		}
		pointer=pointer.next.next;
		
		return pointer;
	}
	
	public void outputLinkedListTail()
	{
		
		ListElement pointer = new ListElement();
		pointer = this;
		
		do
		{
			
			int point = pointer.data;
			System.out.print(point);
			System.out.print(", ");
			pointer = pointer.next;
			
		}while(pointer.next !=null);
		
		int point = pointer.data;
		
		System.out.print(point);
		
	}
	
}
			