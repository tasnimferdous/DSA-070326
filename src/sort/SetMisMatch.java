package sort;

import java.util.Arrays;

public class SetMisMatch {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }

        for(i = 0; i < nums.length; i++){
            if(nums[i] != i+1){
                return new int[] {nums[i], i+1};
            }
        }
        return new int[] {-1, -1};
    }
}
