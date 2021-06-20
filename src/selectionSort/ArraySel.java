package selectionSort;

public class ArraySel {
    private long[] a;
    private int nElems;

    public ArraySel(int max)
    {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value)
    {
        a[nElems] = value;
        nElems++;
    }

    public void selectionSort()
    {
       int out, in, min;
       for(out=0; out<nElems; out++)
       {
           min = out;
           for(in=out+1; in<nElems; in++)
           {
               if(a[in] < a[min])
                   min = in;
           }
           swap(out, min);
       }
    }

    public void swap(int num1, int num2)
    {
        long temp = a[num1];
        a[num1] = a[num2];
        a[num2] = temp;
    }

    public void display()
    {
        for(int i=0; i<nElems; i++)
            System.out.print(a[i]+" ");
        System.out.println("");
    }
}
