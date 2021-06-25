package LinkedList;

public class LinkListApp {
    public static void main(String[] args)
    {
        LinkList theList = new LinkList();

        theList.insertOrder(22, 2.99);
        theList.insertOrder(3,3.5);
        theList.insertOrder(1,55.5);
        theList.insertOrder(100, 65.3);
        theList.insertOrder(500, 65.3);
        theList.insertOrder(80, 65.3);
        theList.insertOrder(6, 65.3);

        theList.display();
    }
}
