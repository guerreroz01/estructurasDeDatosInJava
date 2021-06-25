package anotherStack;

public class StackList {
    private Node head;

    public StackList()
    {
        head = null;
    }

    public void insert(char value)
    {
        Node newNode = new Node(value);
        if(!isEmpty())
            newNode.next = head;
        head = newNode;
    }

    public char pop()
    {
        if(!isEmpty()) {
            char valueToPop = head.getValue();
            head = head.next;
            return valueToPop;
        } else {
            return '0';
        }
    }

    public boolean isEmpty()
    {
        return head == null;
    }

    public char peek()
    {
        if(!isEmpty())
            return head.getValue();
        else
            return '0';
    }
}

class Node {
    private final char value;
    public Node next;

    public Node(char value)
    {
        this.value = value;
        next = null;
    }

    public char getValue() {
        return value;
    }

}
