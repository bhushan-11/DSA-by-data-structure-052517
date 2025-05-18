package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int [] twoSum ( int [] input , int target) {

        Map<Integer, Integer> complimentMap = new HashMap<>();
        // store the numbers in input next to the indexes
        for(int i=0; i< input.length;i++){

            complimentMap.put(input[i], i);
        }

        //go through the map to find two sum indexes
        for(int i=0;i<input[i]; i++) {
            int compliment = target-input[i];
            if(complimentMap.containsKey(compliment) && complimentMap.get(compliment) !=i) {

                return new int [] { i, complimentMap.get(compliment)};
            }

        }


        return null;
    }

    public static void main (String args[]){

        System.out.println("hi");

        TwoSum ts = new TwoSum();

        ts.twoSum(new int[] { 1,2,4,5} , 9);


    }
}
