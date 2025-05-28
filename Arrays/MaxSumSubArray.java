package Arrays;

public class MaxSumSubArray {


    public int maxSumbruteForce ( int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i< nums.length;i++){
            int currSum =0;
            for(int j=i; j<nums.length;j++){
               currSum +=nums[j];
               maxSum= Math.max(maxSum, currSum);
            }
        }

        return maxSum;
    }

    public int maxSumSubKadanes(int nums[]){

        // When

        int maxSum = nums[0];
        int currSum = nums[0];

        for(int i=1 ; i< nums.length;i++) {

            int num= nums[i];
             currSum = Math.max(num, currSum+nums[i]);
             maxSum = Math.max(maxSum, currSum);

        }

        return maxSum;

    }

    public static void main(String args[]) {


        MaxSumSubArray maxSumSubArray = new MaxSumSubArray();

        System.out.println("result is brute : "+ maxSumSubArray.maxSumbruteForce(new int [] { -1,-2,3,4,5,6}));

        System.out.println("result is Kadanes: "+ maxSumSubArray.maxSumSubKadanes(new int [] { -1,-2,3,4,5,6}));


    }
}
