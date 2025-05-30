package heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKfreqElements {

    public int[] topkelements ( int [] nums , int k) {
// create a map to sotre the frequency of elements
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i : nums) {
            frequencyMap.put(i, frequencyMap.getOrDefault(i,0)+1);
        }

        // define the priority query // this is a max heap meaning the high frequency items wil come out first thats why //b-a

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        for(Map.Entry entry : frequencyMap.entrySet()) {
            pq.add(entry) ;  // add each map entry in the priority queue
        }

        int output[] = new int[k];

        for(int i=0;i<k;i++) {
            output[i]= pq.poll().getKey();
        }

        return output;

    }


    public static void main (String args[] ) {

       TopKfreqElements topKfreqElements = new TopKfreqElements();

       int output[]= topKfreqElements.topkelements(new int[] {1,1,1,2,2,3,4}, 2);

       for(int i=0; i< output.length;i++) {
           System.out.println(output[i]);
       }

    }
}
