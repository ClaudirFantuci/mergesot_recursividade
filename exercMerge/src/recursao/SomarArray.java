package recursao;

public class SomarArray {

    // EXERC 2
    public static int somaArray(int[] array, int indice) {
        if (indice == array.length) {
            return 0;
        }
        return array[indice] + somaArray(array, indice + 1);
    }
    
}
