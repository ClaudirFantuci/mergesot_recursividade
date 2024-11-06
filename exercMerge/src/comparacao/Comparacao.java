package comparacao;
import java.util.Arrays;
import java.util.Random;
public class Comparacao {
    public static void main(String[] args) {
    	
    	int vetor[] = new int[1000];
    	
        int[] sizes = {1000, 10000, 100000, 1000000};
//        int numExecutions = 10;

        for (int size : sizes) {
//            double mergeSortTime = 0;
//            double bubbleSortTime = 0;
//            double selectionSortTime = 0;
//            double insertionSortTime = 0;

//            for (int i = 0; i < numExecutions; i++) {
        		vetor = preencherArray(vetor);

//                int[] arrayCopy = Arrays.copyOf(veto, array.length);
                long inicio = System.nanoTime();
                MergeSort.executarMergeSort(Arrays.copyOf(vetor, vetor.length));
                long fim = System.nanoTime();
                mergeSortTime += (fim - inicio);

                arrayCopy = Arrays.copyOf(array, array.length);
                inicio = System.nanoTime();
                BubbleSort.executarBubbleSort(arrayCopy);
                fim = System.nanoTime();
                bubbleSortTime += (fim - inicio);

                arrayCopy = Arrays.copyOf(array, array.length);
                inicio = System.nanoTime();
                SelectionSort.executarSelectionSort(arrayCopy);
                fim = System.nanoTime();
                selectionSortTime += (fim - inicio);

                arrayCopy = Arrays.copyOf(array, array.length);
                inicio = System.nanoTime();
                InsertionSort.executarInsertionSort(arrayCopy);
                fim = System.nanoTime();
                insertionSortTime += (fim - inicio);

//            }

            System.out.println("\nTamanho do vetor: " + size);
            System.out.println("MergeSort tempo: " + (mergeSortTime  / 1000000000) + " s");

            System.out.println("BubbleSort tempo: " + (bubbleSortTime / 1000000000) + " s");

            System.out.println("SelectionSort tempo: " + (selectionSortTime / 1000000000) + " s");

            System.out.println("InsertionSort tempo: " + (insertionSortTime / 1000000000) + " s");
        }
    }
	public static int [] preencherArray(int x[]) {
		Random gerador = new Random();
		for (int i = 0; i < x.length; i++) {
			x[i] = gerador.nextInt(1000);
		}
		return x;
		
	}
}
	