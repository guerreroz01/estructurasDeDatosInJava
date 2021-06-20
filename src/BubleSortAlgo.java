public class BubleSortAlgo {

    public static void main(String[] args) {
        int[] myArray = {1000, 23, 98, 15, 47, 62, 99, 122};

        Ordenador nuevaLista = new Ordenador(myArray);
        nuevaLista.show();
    }
}

class Ordenador {
    private final int[] orderedArr;

    public Ordenador(int[] arr) {
        this.orderedArr = ordenar(arr, 0);

    }

    public void show() {
        for (int i = 0; i < orderedArr.length; i++) {
            System.out.println(orderedArr[i]);
        }
    }

    public int[] getOrderedArr() {
        return orderedArr;
    }

    private int[] ordenar(int[] arr, int ind) {
        if(ind > arr.length) return arr;
        bubleSort(arr, 0);
        return ordenar(arr, ind +1);
    }

    private static int[] bubleSort(int[] newArr, int indice) {
        if (indice > newArr.length - 1) return newArr;
        if (indice < newArr.length - 1 && (newArr[indice] > newArr[indice + 1])) {
            int temp = newArr[indice];
            newArr[indice] = newArr[indice + 1];
            newArr[indice + 1] = temp;
        }
        return bubleSort(newArr, indice + 1);
    }

}
