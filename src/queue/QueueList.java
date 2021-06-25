package queue;

public class QueueList {
    private Node head;
    private int count;

    public QueueList()
    {
        head = null;
        count = 0;
    }

    public void insert(char value)
    {
        if(count < 10) {
            Node newNode = new Node(value);
            if(!isEmpty())
                newNode.next = head;

            head = newNode;
            count++;
        } else {
            System.out.println("Stack is Full");
        }

    }

    public boolean isEmpty()
    {
        return count==0;
    }

    public char pop()
    {
        if(!isEmpty())
        {
            Node temp = head;
            Node before = head;
            while(temp.next != null) {
                before = temp;
                temp = temp.next;
            }
            before.next = null;
            count--;
            return temp.getValue();
        }
        return '-';
    }
}

class Node{
    private final char value;
    Node next;

    public Node(char value)
    {
        this.value = value;
    }

    public char getValue()
    {
        return value;
    }
}
