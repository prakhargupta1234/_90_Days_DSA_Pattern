package Day18;

public class Length_of_the_Longest_Alphabetical_Continuous_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int longestContinuousSubstring(String s) {
	        int max=0;
	        int curr=1;
	        int n= s.length();
	        char prev= s.charAt(0);
	        for(int i=1;i<n;i++){
	            char ch= s.charAt(i);
	            if(ch-prev==1){
	                curr++;
	            }else{
	                max=Math.max(max, curr);
	                curr=1;
	            }
	            prev= ch;
	        }
	        max=Math.max(max, curr);
	        return max;
	    }

}
