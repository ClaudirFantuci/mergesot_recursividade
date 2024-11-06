package recursao;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        // Test mergeSort with int[][]
        int[][] matriz = {
                { 5, 2, 9, 1, 5, 6 },
                { 3, 4, 7, 8, 2, 1 },
                { 9, 7, 5, 3, 1, 2 }
        };
        mergeSort(matriz);
        for (int[] array : matriz) {
            System.out.println(Arrays.toString(array));
        }

        // Test mergeSort with Pessoa[]
        Pessoa[] pessoas = {
                new Pessoa("Alice", 30),
                new Pessoa("Bob", 25),
                new Pessoa("Charlie", 35)
        };
        mergeSort(pessoas);
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome() + " - " + pessoa.getIdade());
        }

        // Test mergeSort with String[]
        String[] strings = { "banana", "apple", "orange", "grape" };
        mergeSort(strings);
        System.out.println(Arrays.toString(strings));
    }

    public static void mergeSort(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            mergeSort(matriz[i], 0, matriz[i].length - 1);
        }
    }

    // EXERC 7
    public static void mergeSort(int[] array, int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = (esquerda + direita) / 2;
            mergeSort(array, esquerda, meio);
            mergeSort(array, meio + 1, direita);
            merge(array, esquerda, meio, direita);
        }
    }

    public static void merge(int[] array, int esquerda, int meio, int direita) {
        int n1 = meio - esquerda + 1;
        int n2 = direita - meio;

        int[] arrayEsquerda = new int[n1];
        int[] arrayDireita = new int[n2];

        for (int i = 0; i < n1; ++i) {
            arrayEsquerda[i] = array[esquerda + i];
        }
        for (int j = 0; j < n2; ++j) {
            arrayDireita[j] = array[meio + 1 + j];
        }

        int i = 0, j = 0;
        int k = esquerda;
        while (i < n1 && j < n2) {
            if (arrayEsquerda[i] <= arrayDireita[j]) {
                array[k] = arrayEsquerda[i];
                i++;
            } else {
                array[k] = arrayDireita[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = arrayEsquerda[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = arrayDireita[j];
            j++;
            k++;
        }
    }

    // EXERC 8
    public static void mergeSort(Pessoa[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        mergeSort(array, 0, array.length - 1);
    }

    public static void mergeSort(Pessoa[] array, int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = (esquerda + direita) / 2;
            mergeSort(array, esquerda, meio);
            mergeSort(array, meio + 1, direita);
            merge(array, esquerda, meio, direita);
        }
    }

    public static void merge(Pessoa[] array, int esquerda, int meio, int direita) {
        int n1 = meio - esquerda + 1;
        int n2 = direita - meio;

        Pessoa[] arrayEsquerda = new Pessoa[n1];
        Pessoa[] arrayDireita = new Pessoa[n2];

        for (int i = 0; i < n1; ++i) {
            arrayEsquerda[i] = array[esquerda + i];
        }
        for (int j = 0; j < n2; ++j) {
            arrayDireita[j] = array[meio + 1 + j];
        }

        int i = 0, j = 0;
        int k = esquerda;
        while (i < n1 && j < n2) {
            if (arrayEsquerda[i].getIdade() <= arrayDireita[j].getIdade()) {
                array[k] = arrayEsquerda[i];
                i++;
            } else {
                array[k] = arrayDireita[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = arrayEsquerda[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = arrayDireita[j];
            j++;
            k++;
        }
    }

    // EXERC 9
    public static void mergeSort(String[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        mergeSort(array, 0, array.length - 1);
    }

    public static void mergeSort(String[] array, int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = (esquerda + direita) / 2;
            mergeSort(array, esquerda, meio);
            mergeSort(array, meio + 1, direita);
            merge(array, esquerda, meio, direita);
        }
    }

    public static void merge(String[] array, int esquerda, int meio, int direita) {
        int n1 = meio - esquerda + 1;
        int n2 = direita - meio;

        String[] arrayEsquerda = new String[n1];
        String[] arrayDireita = new String[n2];

        for (int i = 0; i < n1; ++i) {
            arrayEsquerda[i] = array[esquerda + i];
        }
        for (int j = 0; j < n2; ++j) {
            arrayDireita[j] = array[meio + 1 + j];
        }

        int i = 0, j = 0;
        int k = esquerda;
        while (i < n1 && j < n2) {
            if (arrayEsquerda[i].compareTo(arrayDireita[j]) <= 0) {
                array[k] = arrayEsquerda[i];
                i++;
            } else {
                array[k] = arrayDireita[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = arrayEsquerda[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = arrayDireita[j];
            j++;
            k++;
        }
    }

}
