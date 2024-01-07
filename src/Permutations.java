public class Permutations {
    public static void main(String[] args) {
        int[] arr = {2,0, 1};

        System.out.println(findMaxProd(arr));
    }

    private static int findMaxProd(int[] nums) {


                int max1 = Integer.MIN_VALUE; //biggest
                int max2 = Integer.MIN_VALUE; //second biggest
                int min1 = Integer.MAX_VALUE; //smallest
                int min2 = Integer.MAX_VALUE; //second smallest

                for(int i = 0; i < nums.length; i++) {
                    if(nums[i] > max1) {
                        max2 = max1;
                        max1 = nums[i];
                    }else if(nums[i] > max2) max2 = nums[i];

                    if(nums[i] < min1) {
                        min2 = min1;
                        min1 = nums[i];
                    }else if(nums[i] < min2) min2 = nums[i];
                }

                return Math.max((min1 - 1) * (min2 - 1), (max1 - 1) * (max2 - 1));

        }
}
