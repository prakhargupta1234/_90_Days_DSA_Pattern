package Day29;

public class N_meetings_in_one_room {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public int maxMeetings(int start[], int end[]) {
	        // add your code here
	         int[][] arr= new int[start.length][2];
	         for(int i=0;i<start.length;i++){
	             arr[i][0]= start[i];
	             arr[i][1]= end[i];
	         }
	         Arrays.sort(arr, (a,b)->{
	             return a[1]- b[1];
	         });
	         
	         int c=1;
	         int last= arr[0][1];
	         for(int i=1;i<start.length;i++){
	             if(arr[i][0]>last){
	                 c++;
	                 last= arr[i][1];
	             }
	         }
	         return c;
	    }
}
