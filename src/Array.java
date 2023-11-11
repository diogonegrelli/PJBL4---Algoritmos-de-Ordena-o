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
            System.out.println("Array após ordenação bubblesort:");
            System.out.println(array);

        }


    }




}

    /*public ArrayList insertionSort(){
        return array;
    }

    public ArrayList quickSort(){
        return array;
    }*/


