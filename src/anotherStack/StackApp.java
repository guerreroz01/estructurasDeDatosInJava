package anotherStack;

public class StackApp {
    public static void main(String[] args)
    {
        StackList stack;

        stack = new StackList();

        String text = "part";

        for(int i=0; i<text.length(); i++)
        {
            stack.insert(text.charAt(i));
        }

        while(!stack.isEmpty())
        {
            System.out.print(stack.pop());
        }
    }
}
