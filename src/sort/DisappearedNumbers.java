package sort;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

        System.out.println(findDisappearedNumbers(arr));
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[correctIndex] != nums[i]){
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }

        List<Integer> arr = new ArrayList<>();
        for(i = 0; i < nums.length; i++){
            if(nums[i] != i+1){
                arr.add(i+1);
            }
        }

        return arr;
    }
}
