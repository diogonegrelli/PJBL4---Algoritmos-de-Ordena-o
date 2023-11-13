import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Array ordenacao = new Array();

        ArrayList <Integer> array = new ArrayList<>();
        int [] nums = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        for (int i : nums ) {
            array.add(i);
        }


        ordenacao.bubbleSort(array, array.size());

        ordenacao.quickSort(array, 0, (array.size() - 1));
        System.out.println("Array ordenado com QuickSort:");
        System.out.println(array);
        ordenacao.insertionSort(nums);


    }
}
