package bit;

//any number n ^ 1 = complement of n
//any number n ^ 0 = n
//any number n ^ n = 0

public class UniqueNumber {
    public static void main(String[] args) {
        int[] nums = {2,5,3,2,6,3,5};
        System.out.println(findUnique(nums));
    }

    static int findUnique(int[] nums) {
        int res = 1;
        for(int n : nums){
            res ^= n;
        }
        return res;
    }
}
