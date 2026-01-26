package Day19;

public class Overlapping_Intervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public ArrayList<int[]> mergeOverlap(int[][] arr) {
	        // Code here
	        Arrays.sort(arr, (a, b)-> Integer.compare(a[0], b[0]));
	        int[] curr= arr[0];
	        ArrayList<int[]>  ans= new ArrayList<>();
	        ans.add(curr);
	        for(int i=1;i<arr.length;i++){
	            if(curr[1]>=arr[i][0]){
	                curr[1]= Math.max(curr[1], arr[i][1]);
	            }else{
	                curr= arr[i];
	                ans.add(curr);
	            }
	        }
	        return ans;
	        
	    }

}
