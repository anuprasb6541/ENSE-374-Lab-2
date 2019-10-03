public class ListElement
{
        private ListElement next;
        private ListElement prev;
        private int data;


    ListElement()
    {

        this.data = 0;
        this.next = null;
        this.prev = null;

    }

    public ListElement getNext() 
    {

        return this.next;

    }

    public void setNext(ListElement next)
    {

        this.next = next ;

    }

    public ListElement getPrev()
    {

        return this.prev;

    }

    public void setPrev(ListElement prev)
    {

        this.prev = prev ;

    }

    public int getData()
    {

        return this.data;

    }

    public void setData(int data)
    {

        this.data = data ;

    }

    public String toString()
    {

        return ""+this.data;

    }

}