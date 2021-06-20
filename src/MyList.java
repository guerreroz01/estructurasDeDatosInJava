
public class MyList{
    public static void main(String[] args)
    {
        int[] miLista = {10, 22, 33, 45, 58, 60, 72, 85, 89, 99, 100, 120, 130};
        //               0   1   2   3   4   5    6   7  8   9    10   11   12
        int valor = 99;

        int resultado = buscar(miLista, valor, 0, miLista.length);

        if(resultado == -1){
            System.out.println("");
            System.out.println("El numero no se encontró");
        } else {
            System.out.println("");
            System.out.println("El indice del valor: " + valor + " es la posición " + resultado);
        }
    }

    public static int buscar(int[] lista, int valor, int principio, int finalLista)
    {
        int izquierda = principio;
        int derecha = finalLista;
        int medio = (izquierda + derecha) / 2;

        if(izquierda > derecha) return -1;
        else if(lista[medio] == valor) return medio;
        else {
            if(lista[medio] < valor)
                return buscar(lista, valor, medio + 1, derecha);
            else
                return buscar(lista, valor, izquierda, medio - 1);
        }
    }

}