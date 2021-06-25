package LinkedList;

public class LinkList {
    private Link first;
    private Link last;

    public LinkList()
    {
        first = null;
        last = null;
    }

    public boolean isEmpty()
    {
        return first==null;
    }

    public void insertFist(int id, double dd)
    {

        Link newLink = new Link(id, dd);
        if(isEmpty()) last = newLink;
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(int id, double dd)
    {
        Link newLink = new Link(id, dd);
        if(isEmpty()) first = newLink;
        else last.next = newLink;
        last = newLink;
    }

    public void insertOrder(int id, double dd)
    {
        Link newLink = new Link(id, dd);
        if(isEmpty()) first = newLink;
        // case newLink is lower
        if(newLink.iData < first.iData){
            newLink.next = first;
            first = newLink;
            last = newLink;
        } else {
            //case is greater
            Link current = first;
            while(current.next != null) {
                if(current.next.iData > newLink.iData)
                {
                    newLink.next = current.next;
                    current.next = newLink;
                    break;
                }
                current = current.next;
            }
            //case is the last
            if(current.iData < newLink.iData){
                current.next = newLink;
                last = newLink;
            }
        }
    }

    public Link deleteFirst()
    {
        if(!isEmpty()) {
            Link temp = first;
            first = first.next;
            return temp;
        }
        return null;
    }
    public void display()
    {
        System.out.print("List (first-->last): ");
        Link current = first;
        while(current != null)
        {
            current.display();
            current = current.next;
        }
        System.out.println("");
    }
}
