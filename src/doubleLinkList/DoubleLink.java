package doubleLinkList;

public class DoubleLink {
    private int data;
    DoubleLink prev;
    DoubleLink next;

    public DoubleLink(int data)
    {
        this.data = data;
        prev = null;
        next = null;
    }

    public int getData()
    {
        return data;
    }
}
