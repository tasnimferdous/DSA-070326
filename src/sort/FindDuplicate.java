package sort;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};

        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] != i+1){
                int correctIndex = nums[i] - 1;
                if(nums[correctIndex] != nums[i]){
                    int temp = nums[correctIndex];
                    nums[correctIndex] = nums[i];
                    nums[i] = temp;
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }
}
