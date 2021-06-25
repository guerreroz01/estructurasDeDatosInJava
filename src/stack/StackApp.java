package stack;

public class StackApp {
    public static void main(String[] args)
    {
        int[] myArr = {1,2,3,4,5,6,7,8,9};
        Stack myStack = new Stack();

        for (int i = 0; i < myArr.length; i++) {
            myStack.push(myArr[i]);
        }

        for (int j=0; j< myArr.length; j++)
            System.out.print(myStack.pop() + " ");
        System.out.println("");
    }
}
