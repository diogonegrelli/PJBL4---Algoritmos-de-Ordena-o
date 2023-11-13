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
            printArray(array);
        }
        System.out.println("Após a aplicação do Insertion Sort");    
        for(int i:array){    
            System.out.print(i+ " ");    
        }
    }

    public void printArray(int array[]) {
        int n = array.length;
        System.out.print("Array atual: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}