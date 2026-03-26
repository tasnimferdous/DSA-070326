package search;

public class PackageShipment {
    public static void main(String[] args) {
        int[] weights= {1,11,15,10,16,6,7,8,2,9,7,10};
        int days = 5;
        System.out.println(shipWithinDays(weights, days));
    }

    static int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int sum = 0;
        for(int num : weights){
            max = Math.max(max, num);
            sum += num;
        }
        int start = max;
        int end = sum;
        int res = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (validShipmentDays(weights, days, mid)){
                res = mid;
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        return res;
    }

    static boolean validShipmentDays(int[] weights, int days, int shipSize){
        int sum = 0;
        int count = 1;
        for(int weight : weights){
            sum += weight;
            if(sum > shipSize){
                sum = weight;
                count++;
            }
        }
        return count <= days;
    }
}
