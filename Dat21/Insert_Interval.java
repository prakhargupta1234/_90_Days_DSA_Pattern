package Dat21;

public class Insert_Interval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int[][] insert(int[][] arr, int[] add) {
	        int n= arr.length;
	        int[][] narr= new int[n+1][2];
	        for(int i=0;i<n;i++){
	            narr[i]= arr[i];
	        }
	        narr[n]= add;
	        Arrays.sort(narr, (a,b)->Integer.compare(a[0], b[0]));
	        List<int[]> ll= new ArrayList<>();
	        int [] curr= narr[0];
	        ll.add(curr);
	        for(int [] a: narr){
	            if(a[0]<= curr[1]){
	                curr[1]= Math.max(curr[1], a[1]);
	            }else{
	                curr= a;
	                ll.add(curr);
	            }
	        }

	        return ll.toArray(new int[ll.size()][]);
	    }

}
