public class DoubleLinkedList
{
        private int size;
        private ListElement head;
        private ListElement tail;


    DoubleLinkedList()
    {
        
        this.size=0;
        this.head=null;
        this.tail=null;

    }

    public int getSize()
    {

        return this.size;

    }

    public void addElement(ListElement le)
    {

        if(this.head==null)
        {

            this.head=le;
            this.tail=le;

        }
        else
        {

            ListElement temp=this.tail;
            temp.setNext(le);
            le.setPrev(temp);
            this.tail=le;

        }

        this.size+=1;

    }

    public ListElement getElement(int index)
    {

        if(index==0)
        {

            return this.head;

        }

        if(index==this.size-1)
        {

            return this.tail;
        }

        ListElement temp = this.head;

        for(int i=1;i<=index;i++)
        {

            temp = temp.getNext();

        }

        return temp;

    }

    public ListElement deleteElement(int index)
    {

        if(index==0&&this.size==1)
        {

            ListElement temp = this.head;
            this.head = this.head.getNext();

            if(this.head!=null)
            {
                this.head.setPrev(null);
            }

            this.tail = this.head;
            this.size-=1;

            return temp;
        }


        if(index==this.size-1)
        {

            ListElement temp1 = this.tail;
            this.tail = this.tail.getPrev();
            this.tail.setNext(null);
            this.size-=1;

            return temp1;

        }

        ListElement temp = this.head ;

        for(int i=1;i<=index;i++)
        {

            temp = temp.getNext();
            
        }

        ListElement temp1 = temp.getPrev();
        ListElement temp2 = temp.getNext();

        temp1.setNext(temp2);
        temp2.setPrev(temp1);

        this.size-=1;

        return temp ;

    }

    public void printLinkedListTail()
    {

        if(size==0)
        {

            System.out.println("No elements in list.");

        }



        else if(size==1)
        {

            System.out.print(this.tail);

        }


        else
        {

            ListElement temp = this.tail;
            System.out.print(temp+" ");

            for(int i=1;i<this.size;i++)
            {

                temp = temp.getPrev();
                System.out.print(temp+" ");

            }

        }

    }

    public void printLinkedListHead()
    {

        if(size==0)
        {

            System.out.println("No elements in list.");

        }


        else if(size==1)
        {

            System.out.print(this.head);

        }


        else
        {

            ListElement temp = this.head;
            System.out.print(temp+" ");

            for(int i=1;i<this.size;i++)
            {

                temp = temp.getNext();
                System.out.print(temp+" ");

            }

        }

    }


    public static void main(String args[])
    {

        ListElement le1 = new ListElement();
        le1.setData(1);

        ListElement le2 = new ListElement();
        le2.setData(2);

        ListElement le3 = new ListElement();
        le3.setData(3);

        ListElement le4 = new ListElement();
        le4.setData(4);

        ListElement le5 = new ListElement();
        le5.setData(5);

        DoubleLinkedList dl = new DoubleLinkedList();
        dl.addElement(le1);
        dl.addElement(le2);
        dl.addElement(le3);
        dl.addElement(le4);
        dl.addElement(le5);
        

        System.out.println("\nPrinting starting with head:");
        dl.printLinkedListHead();
		
		System.out.println("\nPrinting starting with tail:");
        dl.printLinkedListTail();

        System.out.println("\nDelete node at index[3] for example");
        System.out.println(dl.deleteElement(3));

		System.out.println("\nPrinting starting with head:");
        dl.printLinkedListHead();
        System.out.println();
		System.out.println("Printing starting with tail:");
        dl.printLinkedListTail();

    }

}