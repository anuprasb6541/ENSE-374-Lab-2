import SingleListElement.ListElement;

public class Driver
{
	
	public static void main(String[] args)
	{
		
		ListElement le = new ListElement();
		le.putData(0);

		
		ListElement le2 = new ListElement();
		le2.putData(1);
		le.insertElement(le2);
		
		ListElement le3 = new ListElement();
		le3.putData(2);
		le2.insertElement(le3);
		
		ListElement le4 = new ListElement();
		le4.putData(3);
		
		le3.insertElement(le4);
		
		le4.outputLinkedListTail();
		
		}
	
}
		
		
