package stack;

interface StackI {
    public boolean isEmpty();
    public int peek();
    public int pop();
    public void push(int n);
}

public class Stack implements StackI {
    private Link anchor;

    public Stack() { anchor = null; }

    @Override
    public boolean isEmpty() {
        return anchor==null;
    }

    @Override
    public int peek() {
        if(isEmpty())
            return -1;
        else
            return anchor.getData();
    }

    @Override
    public int pop() {
        Link temp = anchor;
        anchor = anchor.next;
        temp.next = null;
        return temp.getData();
    }

    @Override
    public void push(int data) {
        Link newLink = new Link(data);
        newLink.next = anchor;
        anchor = newLink;
    }
}
class Link {
    private final int data;
    Link next;

    public Link(int data)
    {
        this.data = data;
        next = null;
    }

    public int getData() { return this.data; }
}
