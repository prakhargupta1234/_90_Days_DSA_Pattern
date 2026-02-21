package Dat42;

import java.util.PriorityQueue;

public class Find_Median_from_Data_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;
    public MedianFinder() {
        min= new  PriorityQueue<Integer>();
        max = new  PriorityQueue<Integer>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        if(max.size()==0){
            max.add(num);
            return;
        }
        if(min.size()== max.size()){
            //even
            if(num>max.peek()){
                min.add(num);
                max.add(min.poll());
            }else{
            //odd
            max.add(num);

        }
        }else{
            //odd
            max.add(num);
            min.add(max.poll());

        }
    }
    
    public double findMedian() {
        if(min.size()== max.size()){
            return (min.peek()+max.peek())/2.0;
        }
        return max.peek();
    }

}
