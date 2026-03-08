package Arrays;

import java.util.ArrayList;

public class MaxNumber {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            array.add(i*9);
        }

        System.out.println(array);
        System.out.println(findMax(array));
    }

    static int findMax(ArrayList<Integer> array) {
        int max = array.getFirst();

        for(int i = 1; i < array.size(); i++){
            if(array.get(i) > max){
                max = array.get(i);
            }
        }
        return max;
    }
}
