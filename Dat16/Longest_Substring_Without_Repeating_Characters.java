package Dat16;

public class Longest_Substring_Without_Repeating_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public int lengthOfLongestSubstring(String s) {
	        Map<Character, Integer> map= new HashMap<>();
	        int i=0;
	        int j=0;
	        int ans= 0;
	        int n= s.length();
	        while(i<n){
	            char ch= s.charAt(i);
	            if(map.containsKey(ch)){
	                if(map.get(ch)>=j){
	                    j= map.get(ch)+1;
	                }
	            }
	            map.put(ch, i);
	            ans= Math.max(ans, i-j+1);
	            i++;
	        }

	        return ans;
	    }
}
