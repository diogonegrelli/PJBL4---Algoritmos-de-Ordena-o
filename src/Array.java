import java.util.ArrayList;

public class Array {

    private final ArrayList<Integer> array = new ArrayList<>();
    int size = array.size();

    public ArrayList<Integer> getArray() {
        return array;
    }

    public void bubbleSort(ArrayList list) {
        int i = 0;
        int current = array.get(i);
        int next = array.get(i + 1);
        int size = list.size();

        if (size >= 1) {
            if (current > next) {
                array.set(i, next);
                array.set((i + 1), current);
                System.out.println(array);
                i++;
                if (i == size) {
                    i = 0;
                }
            }
            else {
                i++;
                if (i == size) {
                    i = 0;
                }
            }
            bubbleSort(list);
        }
        else{
            System.out.println();

    }

    /*public ArrayList insertionSort(){
        return array;
    }

    public ArrayList quickSort(){
        return array;
    }*/

    }
}
