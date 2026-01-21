package Dat14;

public class Longest_Substring_Without_Repeating_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  public int lengthOfLongestSubstring(String s) {
	        Set<Character> set= new HashSet<>();
	        int i=0;
	        int j=0;
	        int ans= 0;
	        int n= s.length();
	        while(i<n){
	            char ch= s.charAt(i);
	            while(set.contains(ch)&&j<=i){
	                set.remove(s.charAt(j));
	                j++;
	            }
	            set.add(ch);
	            ans= Math.max(ans, i-j+1);
	            i++;
	        }

	        return ans;
	    }

}
