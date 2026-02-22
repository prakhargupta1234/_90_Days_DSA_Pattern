package Day46;

public class Minimum_Cost_of_ropes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int minCost(int[] arr) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int val:arr){
            pq.add(val);
        }
        int sum =0;
        while(pq.size()>1){
            int a= pq.poll();
            int b= pq.poll();
            sum += (a+b);
            pq.add(a+b);
        }
      
        return sum;
    }
}

