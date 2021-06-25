package doubleLinkList;

public class DoubleLinkListApp {
    public static void main(String[] args)
    {
        DoubleLinkedList arr;
        arr = new DoubleLinkedList();

        arr.insert(5);

        arr.insert(3);

        arr.insert(2);

        arr.insert(6);

        arr.insert(10);

        arr.insert(8);

        arr.insert(12);

        arr.insert(1);

        arr.display();

        System.out.println(arr.first()+" ");
        System.out.println(arr.last() + " ");


    }
}
