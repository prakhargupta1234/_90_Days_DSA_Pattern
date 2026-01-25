package Day18;

public class Longest_Repeating_Character_Replacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int characterReplacement(String s, int k) {
	        int i=0;
	        int j=0;
	        int n= s.length();
	        int max=0;
	        int maxc=0;
	        int[] freq= new int [26];
	        while(i<n){
	            char ch= s.charAt(i);
	            freq[ch-'A']++;
	            maxc= Math.max(maxc, freq[ch-'A']);
	            while((i-j+1)-maxc>k&&j<=i){
	                freq[s.charAt(j)-'A']--;
	                j++;
	            }

	            max= Math.max(max, i-j+1);
	            i++;
	        }

	        return max;
	    }

}
