public class practica {

    public static void main(String[] args){
        int[] myArr = {44, 50, 12, 76, 1, 89, 32, 46, 11, 200, 9, 5};

        for(int i=0; i<myArr.length; i++)
            System.out.print(myArr[i] + " ");
        System.out.println("");

        insertSort(myArr);

        for(int i=0; i<myArr.length; i++)
            System.out.print(myArr[i] + " ");
        System.out.println("");

    }
    public static void bubleSort(int[] arr)
    {
        for(int i=arr.length-1; i>1; i--)
        {
            for(int j=0; j<i; j++)
            {
                if(arr[j] > arr[i])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr)
    {
        int in, out, min;
        for(out=0; out<arr.length-1; out++)
        {
            min = out;
            for(in=out+1; in<arr.length; in++)
            {
                if(arr[in] < arr[min])
                {
                    min = in;
                }
            }
            int temp = arr[out];
            arr[out] = arr[min];
            arr[min] = temp;
        }
    }
    
    public static void insertSort(int[] arr)
    {
        int x;
        for (int i = 1; i < arr.length; i++) {
            x = i;
            for(int j = i; j > 0; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
