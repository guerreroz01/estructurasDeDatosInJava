package doubleLinkList;

public class DoubleLinkedList {
    private DoubleLink anchor;
    private DoubleLink lastOne;

    public DoubleLinkedList(){}

    public void insert(int data)
    {
        DoubleLink newLink = new DoubleLink(data);
        if(isEmpty()) { anchor = newLink; lastOne = newLink; }
        if(anchor.getData() > newLink.getData()) {
            newLink.next = anchor;
            anchor.prev = newLink;
            anchor = newLink;
        }
        if(anchor.getData() < newLink.getData())
        {
            DoubleLink work = anchor;
            while(true)
            {
                if(work.getData() > newLink.getData())
                {
                    newLink.next = work;
                    newLink.prev = work.prev;
                    work.prev = newLink;
                    newLink.prev.next = newLink;
                    break;
                }
                if(work.next == null) {
                    newLink.prev = work;
                    work.next = newLink;
                    lastOne = newLink;
                    break;
                }
                work = work.next;
            }
        }
    }

    public int first()
    {
        return anchor.getData();
    }

    public int last()
    {
        return lastOne.getData();
    }

    public boolean isEmpty()
    {
        return (anchor == null && lastOne == null);
    }

    public void display()
    {
        DoubleLink work = anchor;
        while(work != null)
        {
            System.out.print(work.getData() + " ");
            work = work.next;
        }
        System.out.println("");

    }

}
