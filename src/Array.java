import java.util.ArrayList;

public class Array {

    public void bubbleSort(ArrayList<Integer> array, int arraySize) {
        int i = 0;
        int size = arraySize;

        if (size > 1) {
            while (i < size - 1) {
                int current = array.get(i);
                int next = array.get((i + 1));

                if (current > next) {
                    array.set(i, next);
                    array.set((i + 1), current);
                    System.out.println(array);
                }
                i++;
            }
            size--;
            bubbleSort(array, size);
//
        } else {
            System.out.println("  ");
            System.out.println("Array após ordenação bubblesort:");
            System.out.println(array);

        }


    }

    public void quickSort(ArrayList<Integer> array, int inicio, int fim) {
        int pivot = fim; //o pivot utilizado é o ultimo valor da lista
        int disponivel = inicio;
        int atual = inicio;
        int aux;

        if (fim - disponivel >= 0) {
            while (atual < pivot) {
                if (array.get(atual) < array.get(pivot)) {
                    aux = array.get(disponivel);
                    array.set(disponivel, array.get(atual));
                    array.set(atual, aux);
                    disponivel++;
                    System.out.println(array);
                }
                atual++;
            }

            aux = array.get(disponivel);
            array.set(disponivel, array.get(pivot));
            array.set(pivot, aux);
            System.out.println(array);

            if (disponivel - inicio >= 0) {
                quickSort(array, inicio, disponivel - 1);
                quickSort(array, disponivel + 1, fim);
            }
        }
    }
}
    /*
    public  void insertionSort(int array[]) {
        int x = array.length;
        for (int j = 1; j < x; j++) {
            int array2 = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > array2)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = array2;
            //printArray(array);
        }
        System.out.println("Após a aplicação do Insertion Sort");    
        for(int i:array){    
            System.out.print(i+ " ");    
        }
    }
    */


