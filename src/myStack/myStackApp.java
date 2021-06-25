package myStack;

public class myStackApp {
    public static void main(String[] args)
    {
        LinkedList arr;
        LinkedList arrReversed;

        arr = new LinkedList();
        arrReversed = new LinkedList();

        String text = "Colorante";

        for(int i=0; i<text.length(); i++)
            arr.push(text.charAt(i));


        while(!arr.isEmpty())
        {
            char value = arr.pop();
            System.out.print(value);
            arrReversed.push(value);
        }
        System.out.println("");
        while(!arrReversed.isEmpty())
            System.out.print(arrReversed.pop());

    }

}
