package sort;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};

        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int rightIndex = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[rightIndex]){
                int temp = nums[i];
                nums[i] = nums[rightIndex];
                nums[rightIndex] = temp;
            }else{
                i++;
            }
        }

        for(i = 0; i < nums.length; i++){
            if(i + 1 != nums[i]){
                return i + 1;
            }
        }
        return nums.length + 1;
    }
}
