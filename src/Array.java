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
        }
        else{
            System.out.println("  ");
            System.out.println("Array após ordenação bubblesort:");
            System.out.println(array);

        }


    }

    public void quickSort(ArrayList<Integer> array, int inicio, int fim){
        int pivot = fim;
        int disponivel = inicio;
        int atual = inicio;
        int aux;

        if (fim - disponivel > 0){
            while (atual < pivot){
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

            if (disponivel - inicio > 0) {
                quickSort(array, inicio, disponivel - 1);
                quickSort(array, disponivel + 1, fim);
            }
        }
    }

}

    /*public ArrayList insertionSort(){
        return array;
    }
    */


