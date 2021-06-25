package recursion;

import java.util.Arrays;

public class TriangleNumbers {
    public static void main(String[] args)
    {


    }

    public static int triangle(int n)
    {
        if(n==1)
            return 1;
        else
            return (n + triangle(n-1));
    }

    public static int factorials(int n)
    {
        if(n==0)
            return 1;
        else
            return (n * factorials(n-1));
    }


}
