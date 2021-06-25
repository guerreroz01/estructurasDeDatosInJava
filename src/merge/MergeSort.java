package merge;

public class MergeSort {
    public static void main(String[] args) {
        int[] arrU = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int[] result = mergeSort(arrU);

        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
        System.out.println("");

    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) return arr;

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right;

        if (arr.length % 2 == 0) right = new int[mid];
        else right = new int[mid + 1];

        for (int i = 0; i < left.length; i++)
            left[i] = arr[i];

        for (int j = 0; j < right.length; j++)
            right[j] = arr[mid + j];

        return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int p1 = 0, p2 = 0, p3 = 0;

        while (p1 < arr1.length || p2 < arr2.length) {
            if (p1 < arr1.length && p2 < arr2.length)
                if (arr1[p1] < arr2[p2])
                    arr3[p3++] = arr1[p1++];
                else
                    arr3[p3++] = arr2[p2++];
            else if (p1 < arr1.length)
                arr3[p3++] = arr1[p1++];
            else
                arr3[p3++] = arr2[p2++];
        }
        return arr3;
    }
}
