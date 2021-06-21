package myStack;

public class LinkedList {
    private Nodo anchor;

    public LinkedList() {
        this.anchor = null;
    }

    public void cleanStack()
    {
        anchor = null;
    }

    public boolean isEmpty()
    {
        if(anchor == null) return true;
        else return false;
    }

    public void push(char value)
    {
        Nodo n1 = new Nodo(value);
        if(anchor == null) anchor = n1;
        else {
            Nodo temp = anchor;
            anchor = n1;
            anchor.sig = temp;
        }
    }

    public void peek()
    {
        if(anchor == null)
            System.out.println("empty Stack");
        else
            System.out.println(anchor.getData());
    }

    public char pop()
    {
        if(anchor == null) {
            System.out.println("empty Stack");
            return '0';
        }
        char value = anchor.getData();
        anchor = anchor.sig;
        return value;
    }
}

class Nodo {
    private final char data;
    public Nodo sig;

    public Nodo(char data)
    {
        this.data = data;
        sig = null;
    }
    public char getData() {
        return data;
    }
}
