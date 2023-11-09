import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Array ordenacao = new Array();

        ArrayList <Integer> array = ordenacao.getArray();
        int [] nums = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        for (int i = 0; i < nums.length; i++){
            array.add(nums[i]);
        }
        ordenacao.bubbleSort(array);
    }
}
