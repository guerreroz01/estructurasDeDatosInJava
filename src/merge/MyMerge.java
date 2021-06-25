package merge;

public class MyMerge {
    public static void main(String[] args)
    {
        int[] arr1 = {2,4,6,8,10};
        int[] arr2 = {1,3,5,7,9};
        int[] arr3 = new int[(arr1.length + arr2.length)];

        merge(arr1, arr1.length, arr2, arr2.length, arr3);

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println("");

    }

    public static void merge(int[] arr1, int size1, int[] arr2, int size2, int[] arr3)
    {
        int arr1I=0, arr2I=0, arr3I=0;
        while(arr1I < size1 && arr2I < size2)
        {
            if(arr1[arr1I] < arr2[arr2I])
            {
                arr3[arr3I++] = arr1[arr1I++];
            } else {
                arr3[arr3I++] = arr2[arr2I++];
            }
        }
        while(arr1I < size1)
        {
            arr3[arr3I++] = arr1[arr1I++];
        }
        while(arr2I < size2)
        {
            arr3[arr3I++] = arr2[arr2I++];
        }
    }
}
