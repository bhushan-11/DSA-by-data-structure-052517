package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {

    //The idea is to break the input in two heaps low ( max heap ) and high (min heap )
    //and keep the sizes approximately same

    // max heap for the smaller half

    PriorityQueue <Integer> low ;

    //min heap for the larger half

    PriorityQueue <Integer> high ;

    public MedianFinder(){
        low= new PriorityQueue<>(Collections.reverseOrder());
        high = new PriorityQueue<>();
    }


    public void addNum(int num) {
        low.offer(num);
        high.offer(low.poll());

        if(low.size() < high.size()){
            low.offer(high.poll());
        }
    }

    public double findMean(){

        if(low.size() == high.size()) {
            return (low.peek() + high.peek() )/ 2.0;
        } else
            return  low.peek();
    }

    public static void main(String args[]) {

        MedianFinder mf = new MedianFinder();

        mf.addNum(1);
        mf.addNum(2);
        System.out.println(mf.findMean());

        mf.addNum(3);

        System.out.println(mf.findMean());
    }
}
