package merge;

public class Merge2 {
    public static void main(String[] args) {
        long[] myArray = new long[100000000];

        for(int i=0; i< myArray.length; i++)
        {
            long n = (long)(java.lang.Math.random()*(myArray.length)-1);
            myArray[i] = n;
        }

        System.out.println("DOne");

    }

   public static long[] mergeSort(long[] arr)
   {
       if(arr.length==1) return arr;

       int mid = arr.length/2;
       long[] left = new long[mid];
       long[] right;
       if(arr.length%2 == 0)
           right = new long[mid];
       else
           right = new long[mid+1];


       for(int i =0; i<left.length; i++)
           left[i] = arr[i];

       for(int j=0; j< right.length; j++)
           right[j] = arr[mid+j];

       return merge(mergeSort(left), mergeSort(right));
   }

   public static long[] merge(long[] arr1, long[] arr2)
   {
       long[] arr3 = new long[arr1.length + arr2.length];
       int p1=0, p2=0, p3=0;

       while(p1<arr1.length || p2<arr2.length)
       {
           if(p1<arr1.length && p2<arr2.length)
               if(arr1[p1] < arr2[p2])
                   arr3[p3++] = arr1[p1++];
               else
                   arr3[p3++] = arr2[p2++];
           else
           {
               if(p1<arr1.length)
                   arr3[p3++] = arr1[p1++];
               else
                   arr3[p3++] = arr2[p2++];
           }
       }
       return arr3;
   }

}

