package sort;

import java.util.Arrays;

//Cyclic sort
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {8,4,7,5,1,9,3,0,2};

        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int rightIndex = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[rightIndex]){
                int temp = nums[i];
                nums[i] = nums[rightIndex];
                nums[rightIndex] = temp;
            }else{
                i++;
            }
        }

        for(i = 0; i < nums.length; i++){
            if(i != nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
